package com.app.demo;

public class Flight implements Comparable<Flight> {
	private int id;
	private String name;
	private String manufactureName;
	private double cost;
	private float rating;
	private boolean availability;
	
	public Flight() {
		
	}

	public Flight (int id, String name, String manufactureName, double cost, float rating, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureName = manufactureName;
		this.cost = cost;
		this.rating= rating;
		this.availability = available;
	}
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", manufactureName=" + manufactureName + ", cost=" + cost
				+ ", rating=" + rating + ", availability=" + availability + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public int compareTo(Flight o) {
		Integer id1=this.id;
		Integer id2 = o.id;
		return id2.compareTo(id1);
	}

}
	