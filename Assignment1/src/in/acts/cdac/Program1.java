package in.acts.cdac;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		
		int y = sc.nextInt();
		System.out.println("Year : "+y );
		
		if (y%400==0) {
			System.out.println("Leap Year");
		}
		else if (y%100==0)
		{
			System.out.println("Not Leap Year");
		}
		else if (y%4==0)
		{
			System.out.println("Leap Year");
		}
		else System.out.println("Not Leap Year");

int r;

r = (y%400==0 || (y%4==0 && y%100 !=0)) ? 1: 0 ;

switch(r) {
case 1:
	System.out.println("Leap Year");
	break;
	
case 0:
	System.out.println(" Not Leap Year");
	break;
	
	}
	}
}
