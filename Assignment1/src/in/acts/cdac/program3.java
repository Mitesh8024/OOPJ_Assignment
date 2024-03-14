package in.acts.cdac;
import java.util.*;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = sc.nextInt();
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Second Number: ");
		int b = scr.nextInt();
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		
		int opt = sc.nextInt();
		float ans;
		switch(opt) {
		case 1:
			ans = a+b;
			System.out.println(ans);
			break;
		case 2:
			ans = a-b;
			System.out.println(ans);
			break;
		case 3:
			ans = a*b;
			System.out.println(ans);
			break;
		case 4:
			ans = a/b;
			System.out.println(ans);
			break;
			default:
				System.out.println("Error");
		}
	}

}
