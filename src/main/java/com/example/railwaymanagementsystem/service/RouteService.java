package com.example.railwaymanagementsystem.service;
import com.example.railwaymanagementsystem.entity.Route;
import com.example.railwaymanagementsystem.repository.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RouteService {
    private final RouteRepository routeRepository;

    public void addRoute(Route route) {
        Route route1 = new Route();
        route1.setId(route.getId());

        routeRepository.save(route1);
    }

    public List<Route> getRoutes() {
        return routeRepository.findAll();
    }



}

