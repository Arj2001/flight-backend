package com.nestdigital.flightbackend.controller;

import com.nestdigital.flightbackend.dao.FlightDao;
import com.nestdigital.flightbackend.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFlight",consumes = "application/json",produces = "application/json")
    public String addFlight(@RequestBody FlightModel flight){
        dao.save(flight);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewFlight")
    public List<FlightModel> viewFlight(){
        return (List<FlightModel>) dao.findAll();
    }
}
