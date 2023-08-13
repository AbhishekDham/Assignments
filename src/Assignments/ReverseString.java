package Assignments;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "test";
		String nstr ="";
		char ch;
		 System.out.println("Original string is : test");
		
		for(int i =0; i<str.length();i++) {
			
			ch = str.charAt(i);
			nstr = ch+nstr;
			int Name = str.length();
			System.out.println(Name);
			
		}
		
		System.out.println("Reverse string is " + nstr);
		
	}

}
