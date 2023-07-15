package Assignments;

import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		while(true) {
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int i = scan.nextInt();
		int sum = 0;
		int digit;
		while(i>0) {
			
			digit = i%10;
			sum = sum + digit;
			i = i/10;
			
					
			
		}
		System.out.println(sum);	
			
			
			
			
		}
	}
		
		
		
	}
	

