package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
