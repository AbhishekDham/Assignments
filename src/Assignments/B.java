package Assignments;

public class B {

	public static void main(String[]  args){

	    A a1 = new A();

	    a1.add(a1.add(10,20),a1.add(30,40));

	  }

	
}

class A{

	  public int add(int i , int j){
		  int k = i+j;
System.out.println(k);
	    return i+j;

	  }

	}

	