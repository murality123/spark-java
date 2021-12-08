package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Hero  extends Vehicle {

	@Override
	public String getModeName() {
		return "roadway";
	}

	@Override
	public String getReistrationNumber() {
		return "KA13U7865";
	}

	@Override
	public String getOwnerName() {
		return "MURALI";
	}
	public int getSpeed() {
		return 50;
	}
	public void radio() {
		System.out.println("it has a facility of radio device");
	}

}
