package com.example.railwaymanagementsystem.service;
import com.example.railwaymanagementsystem.DTO.PassengerDTO;
import com.example.railwaymanagementsystem.entity.Passenger;
import com.example.railwaymanagementsystem.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerService {
    private final PassengerRepository passengerRepository;

    public void addPassenger(PassengerDTO passengerDTO) {
        Passenger passenger1 = new Passenger();
        passenger1.setName(passengerDTO.getName());
        passenger1.setGender(passengerDTO.getGender());
        passenger1.setAge(passengerDTO.getAge());
        passenger1.setPhoneNumber(passengerDTO.getPhoneNumber());

        passengerRepository.save(passenger1);
    }

    public List<Passenger> getPassengers() {
        return passengerRepository.findAll();
    }
    public void updatePassenger(int id,Passenger passenger) {
        Passenger passenger2=passengerRepository.findById(id).get();
        passenger2.setGender(passenger.getGender());
        passenger2.setAge(passenger.getAge());

        passengerRepository.save(passenger2);
    }


}
