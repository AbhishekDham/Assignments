package Assignments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	while(true) {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = scan.nextInt();
		 
		if(isArmstrong(number))  {
			  
			System.out.println("Armstrong ");  
			}  
			else   
			{  
			System.out.println("Not Armstrong ");  
			}
			
			
	}
		}
		
	
	
	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;    
	temp=n;   
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;    
	}   
	temp = n;   
	while(temp>0)   
	{   
	      
	last = temp % 10;   
	  
	sum +=  (Math.pow(last, digits));   
	
	temp = temp/10;   
	}  
	
	if(n==sum)   
	 
	return true;      
	  
	else return false;   
	}   
	
	
}
