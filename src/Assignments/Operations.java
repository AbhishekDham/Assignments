package Assignments;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int input1 = scan.nextInt();
		System.out.println("Enter 2nd number");
		int input2 = scan.nextInt();
		int sum = input1+input2;
		System.out.println("sum of two intgers is " + sum);
		int product = input1*input2;
		System.out.println("Product of two integer is " + product);
		int average = (input1+input2)/2;
		System.out.println("average of two integer is " + average);
		int diffrence = input1-input2;
		System.out.println("diffrence of two integer is " + diffrence);
		if(input1>input2) {
			System.out.println("Maximum number is " + input1);
			
		}
		else {
			System.out.println("Maximum number is " + input2);	
		}
		

		
}
	
		
		
	}
}
