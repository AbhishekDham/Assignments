package Assignments;

public class Extendskey {
	
public static void main(String[] args) {
	
	Child ch = new Child();
	ch.test();
	
	 Parent pa = new Parent();
	 pa.test();
	
}

}

class Parent{
	
	void test() {
		
		System.out.println("Succesfully Access parent method by child as well parent");
		
	}
}

class Child extends Parent {
	
	
}
