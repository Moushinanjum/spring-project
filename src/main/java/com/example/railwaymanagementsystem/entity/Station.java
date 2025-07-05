package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private int contactNumber;
    private String code;

    @OneToMany(mappedBy = "station",cascade = CascadeType.PERSIST)
    @JsonBackReference
    private List<Route> routes;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name="trainLists",
            joinColumns=@JoinColumn(name="station_id"),
            inverseJoinColumns = @JoinColumn(name="train_id")
    )
    private List<Train> trains;

}
