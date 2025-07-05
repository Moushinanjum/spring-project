package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private int total_coaches;
    private int capacity;
    private String operatorName;

    @OneToMany(mappedBy = "train",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Coach> coaches;

    @OneToMany(mappedBy = "train",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Employee> employees;

   @OneToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name="route_id")
   @JsonBackReference
   private Route routes;

    @OneToMany(mappedBy = "train",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Schedule> schedules;


    @ManyToMany(mappedBy = "trains",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Station> stations;


    @OneToMany(mappedBy = "trainList",cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Ticket> tickets;



}
