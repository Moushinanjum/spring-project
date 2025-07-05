package com.example.railwaymanagementsystem.controller;
import com.example.railwaymanagementsystem.entity.Station;
import com.example.railwaymanagementsystem.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

     @RestController
     @RequiredArgsConstructor
    public class StationController {
        private final StationService stationService;

        @PostMapping("/station/add/")
        public void addStation(@RequestBody Station station){
            stationService.addStation(station);
        }

        @GetMapping("/station/get/")
        public List<Station> getStations(){

            return stationService.getStations();
        }
        @PutMapping("/station/update/{id}")
        public void updateStation(@PathVariable int id,@RequestBody Station station){
            stationService.updateStation(id,station);
        }
        @DeleteMapping("/station/delete/{id}")
        public void deleteStation(@PathVariable int id ){

            stationService.deleteStation(id);
        }


    }

