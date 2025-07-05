package com.example.railwaymanagementsystem.service;
import com.example.railwaymanagementsystem.entity.Ticket;
import com.example.railwaymanagementsystem.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public void addTicket(Ticket ticket) {
        Ticket ticket1 = new Ticket();
        ticket1.setId(ticket.getId());
        ticket1.setBookingDate(ticket.getBookingDate());
        ticket1.setTravelDate(ticket.getTravelDate());
        ticket1.setTotalFee(ticket.getTotalFee());
        ticket1.setStatus(ticket.getStatus());

        ticketRepository.save(ticket1);
    }

    public List<Ticket> getTicket() {
        return ticketRepository.findAll();
    }
    public void updateTicket(int id,Ticket ticket){
        Ticket ticket2=ticketRepository.findById(id).get();
        ticket2.setBookingDate(ticket.getBookingDate());
        ticket2.setTravelDate(ticket.getTravelDate());

        ticketRepository.save(ticket2);
    }

    public void deleteTicket(int id){
        Ticket ticket3=ticketRepository.findById(id).get();
        ticketRepository.delete(ticket3);

    }
}
