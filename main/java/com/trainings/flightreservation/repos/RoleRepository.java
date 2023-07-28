package com.trainings.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainings.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
