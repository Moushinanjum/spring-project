package com.example.railwaymanagementsystem.service;

import com.example.railwaymanagementsystem.entity.Seat;

import com.example.railwaymanagementsystem.repository.SeatRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {
    private final SeatRepository seatRepository;

    public void addSeat(Seat seat) {
        Seat seat1 = new Seat();
        seat1.setId(seat.getId());
        seat1.setNumber(seat.getNumber());
        seat1.setType(seat.getType());

        seatRepository.save(seat1);
    }

    public List<Seat> getSeats() {
        return seatRepository.findAll();
    }
    public void updateSeat(int id,Seat seat){
        Seat seat2=seatRepository.findById(id).get();
        seat2.setType(seat.getType());

        seatRepository.save(seat2);
    }

    public void deleteSeat(int id){
        Seat seat3=seatRepository.findById(id).get();
        seatRepository.delete(seat3);

    }
}
