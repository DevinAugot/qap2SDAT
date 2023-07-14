package org.keyin.city;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.keyin.city.City;
import java.util.List;
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}