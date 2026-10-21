package com.hcl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.hcl.model.TicketType;
import com.hcl.service.TicketTypeService;

@RestController
@RequestMapping("/ticket-types")
public class TicketTypeController {

    private final TicketTypeService ticketTypeService;

    public TicketTypeController(TicketTypeService ticketTypeService) {
        this.ticketTypeService = ticketTypeService;
    }

    @GetMapping
    public List<TicketType> getAllTicketTypes() {
        return ticketTypeService.getAllTicketTypes();
    }

    @GetMapping("/{id}")
    public TicketType getTicketTypeById(@PathVariable Long id) {
        return ticketTypeService.getTicketTypeById(id);
    }

    @PostMapping
    public TicketType createTicketType(@RequestBody TicketType ticketType) {
        return ticketTypeService.saveTicketType(ticketType);
    }

    @DeleteMapping("/{id}")
    public void deleteTicketType(@PathVariable Long id) {
        ticketTypeService.deleteTicketType(id);
    }
}