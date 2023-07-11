package Assignments;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		while(true) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		if(number>0) {
			
			System.out.println(number + " is postibve " );
		}
		
		else 
			
			if(number<0) {
			
			System.out.println(number + " is Negative " );
		}
			else {
				System.out.println(" The number is Zero " );
				
			}
		
		
		
	}

	
	
}

}