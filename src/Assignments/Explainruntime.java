package Assignments;

public class Explainruntime {


	
	public static void main(String[] args) {
		// here we take parent class as reference and creating object of child class
		car cal = new maruti();
		//maruti cal3 = new car();
		
		// result of the method - it will call the child method due to overriding concept 
		cal.method1();
		
		//run time polymorphism decide at run time which method can be access. so can not access the method method2 of the child class 
		//child class method - cal.method2();
		cal.method3();
		
	}

}

// parent & child inheritance

class car{
	
	void method1() {
		System.out.println("Executing poly morphism");
	}
	
	void method3() {
		System.out.println("Executing poly morphism");
	}
	
}

class maruti extends car{
	
	void method1() {
		System.out.println("Child");
	}
	
	void method2()
{
		
System.out.println("Method 2");
}
}