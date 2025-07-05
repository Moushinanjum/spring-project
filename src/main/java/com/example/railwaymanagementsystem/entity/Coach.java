package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String number;
    private int totalSeats;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="train_id")
    @JsonBackReference
    private Train train;

    @OneToMany(mappedBy = "coach", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Seat> seats;

}
