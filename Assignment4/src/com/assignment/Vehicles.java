package com.assignment;

public class Vehicles {
	String model;
	int year;
	String type;
	int noOfSeats;
	String Color;

	public void displayDetails(String s, int y) {
		this.model = s;
		this.year = y;
		System.out.println("Model : " + this.model);
		System.out.println(" Year : " + this.year);
	}

	public void displayDetails(String s, int y, String t) {
		this.model = s;
		this.year = y;
		this.type = t;
		System.out.printf("%-20s%-10d%-10s", this.model, this.year, this.type);
		
	}

	public void displayDetails(String s, int y, String t, int num, String c) {
		this.model = s;
		this.year = y;
		this.type = t;
		this.noOfSeats = num;
		this.Color = c;
		System.out.printf("%-20s%-10d%-10s%-10d%-10s", this.model, this.year, this.type, this.noOfSeats, this.Color);
	}

	public static void main(String[] args) {
		Vehicles v = new Vehicles();
		v.displayDetails("Innova", 2011);
		v.displayDetails("Maruti", 2005, "Manual");
		v.displayDetails("Tata", 2010, "Auto", 4, "Red");

	}

}
