package com.nestdigital.flightbackend.dao;

import com.nestdigital.flightbackend.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
