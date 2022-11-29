package com.aqms.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aqms.model.AqmsEntity;

@Repository
public interface AirQualityRepository extends CrudRepository<AqmsEntity,Integer>{

}
