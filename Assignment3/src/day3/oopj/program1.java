package day3.oopj;
import java.util.*;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Integer value: ");
		short shortNumber = sc.nextShort();
		//boolean booleanValue = shortNumber; //Not OK
		//byte byteNumber = shortNumber; //Not OK
		//char character = shortNumber; //Not OK
		int integerNumber = shortNumber; //OK
		long longNumber = shortNumber; //OK
		float floatNumber = shortNumber; //OK
		double doubleNumber = shortNumber; //OK
		System.out.println("Short:: "+shortNumber); //32767
		System.out.println("Integer:: "+integerNumber); //32767
		System.out.println("Long:: "+longNumber); //32767
		System.out.println("Float:: "+floatNumber); //32767.0
		System.out.println("Double:: "+doubleNumber); //32767.0
	}

}
