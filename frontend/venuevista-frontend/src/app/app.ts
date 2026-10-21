import { Component, OnInit, inject } from '@angular/core';
import { EventService, Event } from './services/event';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {

  private eventService = inject(EventService);

  events: Event[] = [];

  ngOnInit(): void {
    this.eventService.getEvents().subscribe({
      next: (data) => {
        this.events = data;
      },
      error: (error) => {
        console.error('Error loading events:', error);
      }
    });
  }
}