package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

	@Override
	public String getModeName() {
		// TODO Auto-generated method stub
		return "roadway";
	}

	@Override
	public String getReistrationNumber() {
		// TODO Auto-generated method stub
		return "KA569834";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "MURALI";
	}
	public int getSpeed() {
		return 70;
	}
	public void cdplayer() {
		System.out.println("it has a facility of cd player device");
	}

}
