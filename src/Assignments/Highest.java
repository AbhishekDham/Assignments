package Assignments;

import java.util.Scanner;

public class Highest {
	
	
	public static void main(String[] args) {
		
	

	while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int input1 = scan.nextInt();
		System.out.println("Enter 2nd number");
		int input2 = scan.nextInt();
		System.out.println("Enter 3rd number");
		int input3 = scan.nextInt();
		
		if(input1>input2) {
			
			if(input1>input3) {
				
				System.out.println("Maximum number is " + input1);
			}
			
		}
		else {
			
			if(input2>input3) {
				System.out.println("Maximum number is " + input2);
			}
			else {
				System.out.println("Maximum number is " + input3);	
			}
			
			
			
			
		}
		
		
		
			
			
		}
	}
	
}
