package Assignments;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		while(true) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int nummber = scan.nextInt();
		int reverse = 0;
		while(nummber>0) {
			
			int remainder = nummber%10;
			reverse = reverse*10 + remainder;
			nummber = nummber/10;
			
			
		}
		System.out.println(reverse);
		
		
	}
	}
}
