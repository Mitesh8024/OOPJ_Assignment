package day3.oopj;
import java.util.*;
public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 10;

        // Widening conversion from int to double
        double doubleValue = intValue;

        // Widening conversion from int to float
        float floatValue = intValue;

        // Converting int to boolean (not a widening conversion, but included for demonstration)
        boolean booleanValue = (intValue != 0);
        
        // Converting int to String
        String stringValue = Integer.toString(intValue);

        // Displaying results
        System.out.println("int to double: " + doubleValue);
        System.out.println("int to float: " + floatValue);
        System.out.println("int to boolean: " + booleanValue);
        System.out.println("int to String: " + stringValue);

	}

}
