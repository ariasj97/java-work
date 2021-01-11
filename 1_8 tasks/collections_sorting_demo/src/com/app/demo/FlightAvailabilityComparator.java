package com.app.demo;

import java.util.Comparator;

public class FlightAvailabilityComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		Boolean b1= o1.isAvailability();
		Boolean b2= o2.isAvailability();
		return b2.compareTo(b1);
	}

}
