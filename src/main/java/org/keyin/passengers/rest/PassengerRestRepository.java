package org.keyin.passengers.rest;

import org.keyin.passengers.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface PassengerRestRepository extends JpaRepository<Passenger, Long> {
}
