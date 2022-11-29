package com.aqms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aqms")
public class AqmsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FLOOR_NO")
	private int floor_no;

	@Column(name = "O2_LEVEL")
	private int o2_level;

	@Column(name = "CO2_LEVEL")
	private int co2_level;

	@Column(name = "SO2_LEVEL")
	private int so2_level;

	@Column(name = "CO_LEVEL")
	private int co_level;

	@Column(name = "C_LEVEL")
	private int c_level;

	// Constructor
	public AqmsEntity() {

	}

	public AqmsEntity(int floor_no, int o2_level, int co2_level, int so2_level, int co_level, int c_level) {

		this.floor_no = floor_no;
		this.o2_level = o2_level;
		this.co2_level = co2_level;
		this.so2_level = so2_level;
		this.co_level = co_level;
		this.c_level = c_level;
	}

	// Getters
	public int getFloor_no() {
		return floor_no;
	}

	public void setFloor_no(int floor_no) {
		this.floor_no = floor_no;
	}

	public int getO2_level() {
		return o2_level;
	}

	public void setO2_level(int o2_level) {
		this.o2_level = o2_level;
	}

	public int getCo2_level() {
		return co2_level;
	}

	public void setCo2_level(int co2_level) {
		this.co2_level = co2_level;
	}

	public int getSo2_level() {
		return so2_level;
	}

	public void setSo2_level(int so2_level) {
		this.so2_level = so2_level;
	}

	public int getCo_level() {
		return co_level;
	}

	public void setCo_level(int co_level) {
		this.co_level = co_level;
	}

	public int getC_level() {
		return c_level;
	}

	public void setC_level(int c_level) {
		this.c_level = c_level;
	}

}
