package com.example.railwaymanagementsystem.controller;

import com.example.railwaymanagementsystem.entity.Route;
import com.example.railwaymanagementsystem.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;

    @PostMapping("/route/add/")
    public void addRoute(@RequestBody Route route){

        routeService.addRoute(route);
    }

    @GetMapping("/route/get")
    public List<Route> getRoutes(){
        return routeService.getRoutes();
    }

}