package com.example.railwaymanagementsystem.service;
import com.example.railwaymanagementsystem.entity.Coach;
import com.example.railwaymanagementsystem.repository.CoachRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoachService {
    private final CoachRepository coachRepository;

    public void addCoach(Coach coach) {
        Coach coach1 = new Coach();
        coach1.setId(coach.getId());
        coach1.setType(coach.getType());
        coach1.setNumber(coach.getNumber());
        coach1.setTotalSeats(coach.getTotalSeats());

        coachRepository.save(coach1);
    }

    public List<Coach> getCoaches() {
        return coachRepository.findAll();
    }
    public void updateCoach(int id,Coach coach){
        Coach coach2 = new Coach();

        coach2.setType(coach.getType());
        coach2.setNumber(coach.getNumber());
        coach2.setTotalSeats(coach.getTotalSeats());

        coachRepository.save(coach2);
    }

    public void deleteCoach(int id){
        Coach coach3=coachRepository.findById(id).get();
        coachRepository.delete(coach3);

    }
}
