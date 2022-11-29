package com.aqms.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aqms.model.AqmsEntity;
import com.aqms.repo.AirQualityRepository;

@Service
public class AqmsService {
	
	@Autowired
	private AirQualityRepository airQualityRepository;
	
	//Retrieve all floor sensor data 
	public List<AqmsEntity> getAllDate() {
		List<AqmsEntity> aqmsData = new ArrayList<>();
		airQualityRepository.findAll().forEach(aqmsData::add);
		return aqmsData;
	}
	
	//Retrieve sensor data based on floor no
	public AqmsEntity getOneFloor(int floor_no) {
		return airQualityRepository.findById(floor_no).orElse(null);
	}
	
	// To add a floor data to table 
	public void addFloorData(AqmsEntity aqms) {
		airQualityRepository.save(aqms);
	}
	
	//To Update a Floor data
	public void updateFloorData(int floor_no,AqmsEntity aqms) {
		airQualityRepository.save(aqms);
	}
	
	//To Delete a Floor data
		public void deleteFloorData(int floor_no) {
			airQualityRepository.deleteById(floor_no);
		}

}
    