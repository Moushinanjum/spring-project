package com.example.railwaymanagementsystem.controller;

import com.example.railwaymanagementsystem.entity.Seat;

import com.example.railwaymanagementsystem.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SeatController {
    private final SeatService seatService;

    @PostMapping("/seat/add/")
    public void addSeats(@RequestBody Seat seat){

        seatService.addSeat(seat);
    }

    @GetMapping("/seat/get")
    public List<Seat> getSeats(){
        return seatService.getSeats();
    }
    @PutMapping("/seat/update/{id}")
    public void updateSeats(@PathVariable int id,@RequestBody Seat seat){

        seatService.updateSeat(id,seat);
    }
    @DeleteMapping("/seat/delete/{id}")
    public void deleteSeats(@PathVariable int id){

        seatService.deleteSeat(id);
    }

}