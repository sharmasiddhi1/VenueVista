package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.TicketType;

public interface TicketTypeRepository extends JpaRepository<TicketType, Long> {

}
