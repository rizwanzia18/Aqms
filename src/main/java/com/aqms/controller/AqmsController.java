package com.aqms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aqms.model.AqmsEntity;
import com.aqms.service.AqmsService;

@RestController
public class AqmsController {
	
	@Autowired
	private AqmsService aqmsservice;
	
	
	//to get all the sensor data
	@GetMapping("/floors")
	public List<AqmsEntity> getAllData(){
		return aqmsservice.getAllDate();
	}
	
	//to get specific floor data 
	@GetMapping("floors/{floor_no}")
	public AqmsEntity getSpecificFloor(@PathVariable int floor_no) {
		return aqmsservice.getOneFloor(floor_no);
	}
	
	//To Post a data 
	@PostMapping("/floors")
	public void addFloorData(@RequestBody AqmsEntity aqmsentity) {
		aqmsservice.addFloorData(aqmsentity);
		
	}
	
	//To Put data
	@PutMapping("/floors/{floor_no}")
	public void updateFloorData(@RequestBody AqmsEntity aqmsentity, @PathVariable int floor_no) {
		aqmsservice.updateFloorData(floor_no,aqmsentity);
	}
	
	//To Delete data
		@DeleteMapping("/floors/{floor_no}")
		public void deleteFloorData(@RequestBody AqmsEntity aqmsentity, @PathVariable int floor_no) {
			aqmsservice.deleteFloorData(floor_no);
		}
	
	
	

}
