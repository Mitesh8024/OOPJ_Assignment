package day3.oopj;
import java.util.*;
import java.util.Scanner;

public class program2 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Integer value: ");
		int integerNumber = sc.nextInt();
		long longNumber = integerNumber; //OK
		float floatNumber = integerNumber; //OK
		double doubleNumber = integerNumber; //OK
		System.out.println("Integer:: "+integerNumber); //2147383647
		System.out.println("Long:: "+longNumber); //2147383647
		System.out.println("Float:: "+floatNumber); //2.14738368E9
		System.out.println("Double:: "+doubleNumber); //2.14738368E9
	}

}
