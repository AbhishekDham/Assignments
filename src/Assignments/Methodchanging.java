package Assignments;

public class Methodchanging {
	
public static void main(String[] args) {
	
	Ab a = new Ab();
	a.method1().method2();
	
}
	
}

class Ab{
	
	public Ab method1() {
		
		System.out.println("its method1");
		return this;
	}
	 
	public Ab method2() {
		 
		 System.out.println("its methid2");
		 return this;
	 }
	

	
}