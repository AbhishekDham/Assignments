package Assignments;

public class Inheritype {

	void Method(){
		System.out.println("Hello");
	}
}

// Single level inheritance
class Single extends Inheritype {
	
	
}
// Multilevel inheritance
class Multilevel extends Single{
	
}

// Hirearchy inheritance
class Hirearchy1 extends Inheritype{
	
}

class Hirearchy2 extends Inheritype{
	
}

// Multiple inhertiance

class Multiple extends Inheritype,Single{
	
}

