package com.example.railwaymanagementsystem.controller;
import com.example.railwaymanagementsystem.entity.Coach;

import com.example.railwaymanagementsystem.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoachController {
    private final CoachService coachService;


    @PostMapping("/coach/add/")
    public void addCoach(@RequestBody Coach coach){

        coachService.addCoach(coach);
    }

    @GetMapping("/coach/get")
    public List<Coach> getCoach(){
        return coachService.getCoaches();
    }
    @PutMapping("/coach/update/{id}")
    public void updateCoach(@PathVariable int id,@RequestBody Coach coach){

        coachService.updateCoach(id,coach);
    }
    @DeleteMapping("/coach/delete/{id}")
    public void deleteCoach(@PathVariable int id){

        coachService.deleteCoach(id);
    }

}