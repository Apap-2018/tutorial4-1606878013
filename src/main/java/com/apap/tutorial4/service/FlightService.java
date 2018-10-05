package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

import java.sql.Date;

public interface FlightService {
    void addFlight(FlightModel flight);
    FlightModel findFlightById(long id);
    void deleteFlight(FlightModel flight);
    void updateFlight(FlightModel flight, String flightNumber, String origin, String destination, Date time);
}
