package com.buses.civa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buses.civa.model.Bus;
import com.buses.civa.service.BusService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;


    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Optional<Bus> getBusById(@PathVariable Integer id) {
        return busService.getBusById(id);
    }
}