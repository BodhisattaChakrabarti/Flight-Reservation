package com.trainings.flightreservation.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trainings.flightreservation.dto.ReservationRequest;
import com.trainings.flightreservation.entities.Flight;
import com.trainings.flightreservation.entities.Reservation;
import com.trainings.flightreservation.repos.FlightRepository;
import com.trainings.flightreservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ReservationController.class);
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") int flightId, ModelMap modelMap)
	{
		LOGGER.info("Inside showCompleteReservation() invoked with flightId: " + flightId);
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		LOGGER.info("Flight found is: " + flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap)
	{
		LOGGER.info("Inside completeReservation(): " + request);
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "reservation created successfully and the ID is: " + reservation.getId());
		return "reservationConfirmation";
	}
}
