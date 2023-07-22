package Assignments;

public class Unidirectional {
	public static void main(String[] args) {
		
		C1 M = new C1();
		M.Test1();
		// Parent can not access the child method as inheritcance is unidirectional.
		M.Test2();
	}

}

class C1 extends Unidirectional{
	void Test1() {
		
	}
	
}

class C2 extends C1{
	 void Test2() {
		 System.out.println("Unidrectional test");
	 }
	
}