package com.sam.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sam.lab.entity.Reservation;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
