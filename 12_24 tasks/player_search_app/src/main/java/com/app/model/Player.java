package com.app.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private String team;
	private int jersey_num;
	
	public Player() {
		
	}

	public Player(int id, String name,int age, String team, int jersey_num) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
		this.jersey_num = jersey_num;
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getJersey_num() {
		return jersey_num;
	}

	public void setJersey_num(int jersey_num) {
		this.jersey_num = jersey_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + ", jersey_num=" + jersey_num
				+ "]";
	}
	
}
