package com.example.railwaymanagementsystem.controller;
import com.example.railwaymanagementsystem.DTO.PassengerDTO;
import com.example.railwaymanagementsystem.entity.Passenger;
import com.example.railwaymanagementsystem.repository.PassengerRepository;
import com.example.railwaymanagementsystem.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;
    private final PassengerRepository passengerRepository;

    @PostMapping("/passenger/add")
    public void addPassenger(@RequestBody PassengerDTO passengerDTO) {

        passengerService.addPassenger(passengerDTO);
    }

    @GetMapping("/passenger/get")
    public List<Passenger> getPassengers() {
        return passengerService.getPassengers();
    }
    @PutMapping("/passenger/update/{id}")
    public void updatePassenger(@PathVariable int id,@RequestBody Passenger passenger) {

        passengerRepository.save(passenger);
    }

}

