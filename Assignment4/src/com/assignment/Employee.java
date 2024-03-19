package com.assignment;

public class Employee {

	 public void displayInfo(String name) {
	        System.out.println("Employee Name: " + name);
	    }
	public void displayInfo(int id) {
        System.out.println("Employee ID: " + id);
    }
    public void displayInfo(double salary) {
        System.out.println("Employee Salary: " + salary);
    }
    
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayInfo("Mitesh Kambli");
        emp.displayInfo(101);       
        emp.displayInfo(50000.50);    
	}

}
