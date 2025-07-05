package com.example.railwaymanagementsystem.repository;

import com.example.railwaymanagementsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
