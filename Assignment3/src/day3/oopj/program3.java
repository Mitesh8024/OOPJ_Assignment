package day3.oopj;
import java.util.*;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Integer value: ");
		double doubleNumber = sc.nextDouble();
		
		byte byteNumber = ( byte )doubleNumber;
		char character = ( char )doubleNumber;
		short shortNumber = (short)doubleNumber;
		int integerNumber = (int)doubleNumber;
		long longNumber = (long) doubleNumber;
		float floatNumber = (float)doubleNumber;
		
		System.out.println("Byte Number:: "+byteNumber); //121
		System.out.println("Character Value:: "+character); //y
		System.out.println("Short Number:: "+shortNumber); //121
		System.out.println("Integer Number:: "+integerNumber); //121
		System.out.println("Long Number:: "+longNumber); //121
		System.out.println("Float Number:: "+floatNumber); //121.65
		System.out.println("Double Number:: "+doubleNumber); //121.65

	}

}
