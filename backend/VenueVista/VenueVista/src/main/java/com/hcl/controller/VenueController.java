package com.hcl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.hcl.model.Venue;
import com.hcl.service.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueController {

    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping
    public List<Venue> getAllVenues() {
        return venueService.getAllVenues();
    }

    @GetMapping("/{id}")
    public Venue getVenueById(@PathVariable Long id) {
        return venueService.getVenueById(id);
    }

    @PostMapping
    public Venue createVenue(@RequestBody Venue venue) {
        return venueService.saveVenue(venue);
    }

    @DeleteMapping("/{id}")
    public void deleteVenue(@PathVariable Long id) {
        venueService.deleteVenue(id);
    }
}