package com.trainings.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainings.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
