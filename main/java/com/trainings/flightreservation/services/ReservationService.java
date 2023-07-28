package com.trainings.flightreservation.services;

import com.trainings.flightreservation.dto.ReservationRequest;
import com.trainings.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
