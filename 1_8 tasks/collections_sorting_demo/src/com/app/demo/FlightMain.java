package com.app.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.app.Product;

public class FlightMain {

	public static void main(String[] args) {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(123, "Flight 123", "Boeing", 300.45, 5.3f, true));
		flightList.add(new Flight(124, "Flight 124", "Boeing", 323.26, 4.5f, false));
		flightList.add(new Flight(125, "Flight 125", "Airbus", 600.84, 3.9f, true));
		flightList.add(new Flight(126, "Flight 126", "Lockheed Martin", 1200.12, 2.4f, false));
		flightList.add(new Flight(127, "Flight 127", "Airbus", 900.16, 6.7f, false));
		
		System.out.println("Printing all the flights on the list");
		printFlights(flightList);
		
		//prints the id's in highest to lowest order
		Collections.sort(flightList);
		System.out.println("\nPrinting the flights sorted by id from highest to lowest");
		printFlights(flightList);
		
		//using java 7 way
		Collections.sort(flightList, new FlightAvailabilityComparator());
		System.out.println("\nPrinting all the flights sorted by availability");
		printFlights(flightList);
		
		Collections.sort(flightList, (Flight f1, Flight f2) ->{
			double d1 = f1.getCost();
			double d2 = f2.getCost();
			return d1.compareTo(d2);
		});

		Collections.sort(flightList, (Product p1, Product p2) -> {
			int x = 0;
			Float f1 = p1.getRatings();
			Float f2 = p2.getRatings();
			x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			return f1.getAirlines().compareTo(f2.getAirlines()); 
			});
		
		System.out.println("\nPrinting all the products sorted by ratings(high to low) and if 2 or more products have same rating then by cost(low to high)");
		printProducts(flightList);

	}

	public static void printFlights(List<Flight> flightList) {
		for(Flight f:flightList) {
			System.out.println(f);
		}
	}
}
