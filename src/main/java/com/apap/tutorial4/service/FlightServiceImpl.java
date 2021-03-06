package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{
    @Autowired
    private FlightDb flightDb;

    @Override
    public void addFlight(FlightModel flight) {
        flightDb.save(flight);
    }

    @Override
    public FlightModel findFlightById(long id) {
        return flightDb.getOne(id);
    }

    @Override
    public void deleteFlight (FlightModel flightModel){
        flightDb.delete(flightModel);
    }

    @Override
    public void updateFlight (FlightModel flight, String flightNumber, String origin, String destination, Date time) {
        flight.setFlightNumber(flightNumber);
        flight.setOrigin(origin);
        flight.setDestination(destination);
        flight.setTime(time);
        flightDb.save(flight);
    }
}
