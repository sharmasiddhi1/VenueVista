package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hcl.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
