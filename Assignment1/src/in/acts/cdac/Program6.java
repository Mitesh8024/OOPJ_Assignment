package in.acts.cdac;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height in meters: ");
		double h = sc.nextDouble();
		
		System.out.println("Enter Weight in kg: ");
		double w = sc.nextDouble();
		
		double bmi = w/(h*h);
		
		System.out.printf("Your BMI is: %.2f\n", bmi);
		
		if (bmi < 18.5) {
			System.out.println("Your are Underweight.");
		}
		else if (bmi>=18.5 && bmi<25) {
			System.out.println("Your have a normal weight.");
		}
		else if (bmi>=25 && bmi<30) {
			System.out.println("Your are Overweight.");
		}
		else {
			System.out.println("Your are obese");
		}
	}

}
