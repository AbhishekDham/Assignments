package Assignments;

public class Runtimepoly {

	public static void main(String...args){
		Car c1 = new Maruti();
		// Cant access the method2 in runtime polymorphism
		c1.method2();
	}
}
class Car{
	public void method1(){
		System.out.println("Car-method1");
	}
}
class Maruti extends Car{
	public void method1(){
		System.out.println("Maruti-method1");
	}
	public void method2(){
		System.out.println("Maruti-method2");
	}
}

