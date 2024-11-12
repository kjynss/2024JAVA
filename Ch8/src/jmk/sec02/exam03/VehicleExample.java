package jmk.sec02.exam03;

import jmk.sec02.exam02.*;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = new Bus();
		
		bus.run();
		bus.checkFare();
	}

}
