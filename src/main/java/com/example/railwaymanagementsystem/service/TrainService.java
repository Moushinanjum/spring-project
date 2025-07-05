package com.example.railwaymanagementsystem.service;

import com.example.railwaymanagementsystem.DTO.TrainDTO;
import com.example.railwaymanagementsystem.entity.Train;
import com.example.railwaymanagementsystem.repository.TrainRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainService {
    private final TrainRepository trainRepository;
    public void addTrain(TrainDTO trainDTO)
    {
        Train train=new Train();
        train.setName(trainDTO.getName());
        train.setType(trainDTO.getType());
        train.setTotal_coaches(trainDTO.getTotal_coaches());
        train.setOperatorName(trainDTO.getOperatorName());
        train.setCapacity(trainDTO.getCapacity());

        trainRepository.save(train);
    }
    public List<Train> getTrains(){
        return trainRepository.findAll();
    }

    public void updateTrain(int id,Train train){
        Train train1=trainRepository.findById(id).get();
        train1.setName(train.getName());
        train1.setType(train.getType());

        trainRepository.save(train1);
    }

    public void deleteTrain(int id){
        Train train2=trainRepository.findById(id).get();
        trainRepository.delete(train2);

    }
}
