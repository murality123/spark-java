package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

	@Override
	public String getModeName() {
		return "roadway";
	}

	@Override
	public String getReistrationNumber() {
		return "KA20AK0849";
	}

	@Override
	public String getOwnerName() {
		return "MURALI";
	}
	public int getSpeed() {
		return 110;
	}
	public void gps() {
		System.out.println("it provides the facility to control the gps device");
	}
}
