package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {

}
