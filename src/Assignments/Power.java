package Assignments;

import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		
		
		// input number
		// Square = input power by 2
		//Square = input power by 3
		//Square = input power by 4
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int input = scan.nextInt();
		int square = input*input;
		System.out.println(square + " is square value");
		int cube = input*input*input;
		System.out.println(cube + " is cube value");
		int fourthpower = input*input*input*input;
		System.out.println(fourthpower + " is fourthpower value");
		
		}
		
	}

}
