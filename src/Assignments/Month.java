package Assignments;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		String monthofname = "unknown";
		int numberofdays = 0;
		while (true) {
			
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int month = scan.nextInt();
		
		switch (month) {
		
		case 1 :
			monthofname = "1";
			numberofdays = 31;
			break;
			
		case 2 :
			monthofname = "2";
			numberofdays = 29;
			break;	
		
		case 3 :
			monthofname = "3";
			numberofdays = 31;
			break;
		
		case 4 :
			monthofname = "4";
			numberofdays = 30;
			break;
			
		case 5 :
			monthofname = "5";
			numberofdays = 31;
			break;
			
		case 6 :
			monthofname = "6";
			numberofdays = 30;
			break;
			
		case 7 :
			monthofname = "7";
			numberofdays = 31;
			break;
			
		case 8 :
			monthofname = "8";
			numberofdays = 30;
			break;
			
		case 9 :
			monthofname = "9";
			numberofdays = 31;
			break;
			
		case 10 :
			monthofname = "10";
			numberofdays = 30;
			break;
			
		case 11 :
			monthofname = "11";
			numberofdays = 31;
			break;
			
		case 12 :
			monthofname = "12";
			numberofdays = 30;
			
		}
		
		System.out.println(monthofname + " has " + numberofdays + " days ");
			
			
		
	}
}
}
