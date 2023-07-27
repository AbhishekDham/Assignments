package Assignments;

public class Runtympoly1 {

	public static void main(String...args){
		Car c1 = new Maruti();
		c1.method1();
		// cant use child class as refrence in object creation
		Maruti1 c2 = new Car1();
		c2.method1();
		}
}
class Car1{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti1 extends Car1{
public void method1(){
System.out.println("Maruti-method1");
}
}