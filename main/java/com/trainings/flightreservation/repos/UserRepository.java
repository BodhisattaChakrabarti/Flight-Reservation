package com.trainings.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainings.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
