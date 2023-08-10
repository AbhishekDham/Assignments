package Assignments;

public class Allcharacters {
	
	public static void main(String[] args) {
		
		String str = "this is java";
		String Name1 = str.substring(0, 4);
		String Name2 = str.substring(5, 7);
		String Name3 = str.substring(8, 12);
		
		
//		System.out.println(Name1);
//		System.out.println(Name2);
//		System.out.println(Name3);
		
		int sum = Name1.length()+Name2.length()+Name3.length();
		
		System.out.println(sum);
		
	}

}
