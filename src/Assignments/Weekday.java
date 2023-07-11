package Assignments;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		
		while (true) {
			
		
		int weeknumber = 0;
		String weekday = "unknown";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		
		switch(number){
		
		case 1:
		weeknumber = 1;
		weekday = "Sunday";
		break;
		
		case 2:
			weeknumber = 2;
			weekday = "Monday";	
			break;
		
		case 3:
			weeknumber = 3;
			weekday = "Tuesday";
			break;
			
		case 4:
			weeknumber = 4;
			weekday = "Wednesday";
			break;
			
		case 5:
			weeknumber = 5;
			weekday = "Thursday";
			break;
			
		case 6:
			weeknumber = 6;
			weekday = "Friday";
			break;
			
		case 7:
			weeknumber = 7;
			weekday = "Saturday";
			
		
		}
		
		System.out.println(weeknumber + " is " + weekday);
		
		
	}
}
}
