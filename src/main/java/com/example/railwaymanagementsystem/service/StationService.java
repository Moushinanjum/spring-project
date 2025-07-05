package com.example.railwaymanagementsystem.service;

import com.example.railwaymanagementsystem.entity.Station;

import com.example.railwaymanagementsystem.repository.StationRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StationService {
    private final StationRepository stationRepository;

    public void addStation(Station station) {
        Station station1 = new Station();
        station1.setId(station.getId());
        station1.setName(station.getName());
        station1.setLocation(station.getLocation());
        station1.setContactNumber(station.getContactNumber());
        station1.setCode(station.getCode());

        stationRepository.save(station1);
    }

    public List<Station> getStations() {
        return stationRepository.findAll();
    }
    public void updateStation(int id,Station station){
        Station station2=stationRepository.findById(id).get();
        station2.setContactNumber(station.getContactNumber());
        station2.setCode(station.getCode());

        stationRepository.save(station2);
    }

    public void deleteStation(int id){
        Station station3=stationRepository.findById(id).get();
        stationRepository.delete(station3);

    }
}

