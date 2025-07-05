package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String arrivalTime;
    private String departureTime;
    private String number;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="train_id")
    @JsonBackReference
    private Train train;

}
