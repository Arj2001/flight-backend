package com.nestdigital.flightbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class FlightModel {

    @Id
    @GeneratedValue
    private int id;
    private String flight_name;
    private String origin;
    private String dest;
    private int capacity;

    public FlightModel(int id, String flight_name, String origin, String dest, int capacity) {
        this.id = id;
        this.flight_name = flight_name;
        this.origin = origin;
        this.dest = dest;
        this.capacity = capacity;
    }

    public FlightModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
