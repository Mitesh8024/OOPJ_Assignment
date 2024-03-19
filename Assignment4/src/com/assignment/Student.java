package com.assignment;

import java.util.Scanner;
class Student {
	private String name;
	private int rollNo;
	private float marks;

	void acceptRecord() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Name : ");
			this.name = sc.nextLine();
			System.out.println("Roll No : ");
			this.rollNo = sc.nextInt();
			System.out.println("Marks : ");
			this.marks = sc.nextFloat();
		}
	}

	void printRecord() {
		System.out.printf("%-10s-%-10d%-10.2f",this.name, this.rollNo, this.marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.acceptRecord();
		s1.printRecord();
	}

}
