package org.keyin.airport;

import org.keyin.airport.Airport;
import org.keyin.city.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
}

