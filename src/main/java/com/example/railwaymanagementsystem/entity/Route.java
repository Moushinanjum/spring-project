package com.example.railwaymanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "routes",cascade = CascadeType.PERSIST)
   @JsonBackReference
  private Train train;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="station_id")
   @JsonBackReference
    private Station station;

}
