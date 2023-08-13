package Assignments;

public class Stringcharsum {
	
	public static void main(String[] args) {
		
		String input = "this is java";
		
		String ip1 = input.substring(0, 4);
		System.out.println(ip1);
		String ip2 = input.substring(5, 8);
		System.out.println(ip2);
		String ip3 = input.substring(8, 12);
		System.out.println(ip3);
		
		int sum = ip1.length()+ip2.length()+ip3.length();
		System.out.println(sum);
	}

}
