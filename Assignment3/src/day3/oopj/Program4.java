package day3.oopj;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 10;
        double doubleValue = 20.5;
        float floatValue = 15.3f;

        // Performing arithmetic operations involving different data types
        double result1 = intValue + doubleValue; // int is widened to double
        float result2 = intValue / floatValue; // int is widened to float
        double result3 = doubleValue * floatValue; // float is widened to double

        // Displaying results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
	}

}
