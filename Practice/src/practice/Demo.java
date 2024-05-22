package practice;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// user input
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a and b ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a + b = " + (a + b));
	}
}	
