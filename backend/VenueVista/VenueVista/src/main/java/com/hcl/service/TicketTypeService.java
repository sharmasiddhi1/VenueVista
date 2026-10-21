package com.hcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.TicketType;
import com.hcl.repository.TicketTypeRepository;

@Service
public class TicketTypeService {

    private final TicketTypeRepository ticketTypeRepository;

    public TicketTypeService(TicketTypeRepository ticketTypeRepository) {
        this.ticketTypeRepository = ticketTypeRepository;
    }

    public List<TicketType> getAllTicketTypes() {
        return ticketTypeRepository.findAll();
    }

    public TicketType getTicketTypeById(Long id) {
        return ticketTypeRepository.findById(id).orElse(null);
    }

    public TicketType saveTicketType(TicketType ticketType) {
        return ticketTypeRepository.save(ticketType);
    }

    public void deleteTicketType(Long id) {
        ticketTypeRepository.deleteById(id);
    }
}