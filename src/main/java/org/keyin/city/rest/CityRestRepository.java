package org.keyin.city.rest;

import org.keyin.city.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRestRepository extends JpaRepository<City, Long> {
    public List<City> findByName(@Param("name")String name);

//    public List<City> findByAirports_code(@Param("code")String code);
}