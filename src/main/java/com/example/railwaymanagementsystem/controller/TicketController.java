package com.example.railwaymanagementsystem.controller;
import com.example.railwaymanagementsystem.entity.Ticket;
import com.example.railwaymanagementsystem.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

     @PostMapping("/ticket/add/")
    public void addTicket(@RequestBody  Ticket ticket){

         ticketService.addTicket(ticket);
    }

    @GetMapping("/ticket/get")
    public List<Ticket> getTicket(){
        return ticketService.getTicket();
    }
    @PutMapping("/ticket/update/{id}")
    public void updateTicket(@PathVariable int id,@RequestBody Ticket ticket){

        ticketService.updateTicket(id,ticket);
    }
    @DeleteMapping("/ticket/delete/{id}")
    public void deleteTicket(@PathVariable int id){

        ticketService.deleteTicket(id);
    }
    
    }



