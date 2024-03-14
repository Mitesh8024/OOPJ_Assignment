package in.acts.cdac;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grades in Numerical: ");
		int marks = sc.nextInt();
		System.out.print("Entered Numerical Grade: "+marks);
		if (marks>=85 && marks<=100)
		{
			System.out.println(" - O Grade");
		}
		else if (marks>=75 && marks<85 ) 
		{
			System.out.println(" - A Grade");
		}
		else if (marks>=60 && marks<75 )
		{
			System.out.println(" - B Grade");
		}
		else if (marks>=40 && marks<60 )
		{
			System.out.println(" - C Grade");
		}
		else if (marks<40 && marks>=0) 
		{
			System.out.println(" - Failed");
		}
		else 
			System.out.println(" Please provide input grades in numerical between 0 to 100");
	}

}
