package com.trainings.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainings.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
