package Assignments;

public class Hourstosecond {

	public static void main(String[] args) {
		
		int i = 86399;
		int h = i/3600;
		System.out.println("Hours value is "+ h);
		int k = i%3600;
		int m = k/60;
		System.out.println("Minute value is " + m);
		int s = i%60;
		System.out.println("Second value is " + s);
		System.out.println(h + " Hours " + m + " minute " + s + " Second ");
		
	}
}
