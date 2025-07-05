package com.example.railwaymanagementsystem.controller;

import com.example.railwaymanagementsystem.DTO.TrainDTO;
import com.example.railwaymanagementsystem.entity.Train;

import com.example.railwaymanagementsystem.service.TrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrainController {
    private final TrainService trainService;
    @PostMapping("/train/add")
    public void addTrain(@RequestBody TrainDTO trainDTO){
        trainService.addTrain(trainDTO);
    }
    @GetMapping("/train/get")
   public List<Train> getTrains(){
        return trainService.getTrains();
    }
    @PutMapping("/train/update/{id}")
    public void updateTrain(@PathVariable int id,@RequestBody Train train){
        trainService.updateTrain(id,train);
    }
    @DeleteMapping("/train/delete/{id}")
    public void deleteTrain(@PathVariable int id){
        trainService.deleteTrain(id);
    }

}


