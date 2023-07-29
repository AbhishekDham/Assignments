package Assignments;

public class Mainclass {
	
	public static void main(String[] args){

		 CP c1 = new CP(); 

	 	c1.test(); 

	} 


}
class AP{

	 void test(){} 

	} 



	class BP extends AP{

	 protected void test(){ } 

	} 



	class CP extends BP{

	 public void test(){
		 
		 System.out.println("Eeucting child method");
		 
	 } 

	}