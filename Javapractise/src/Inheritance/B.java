package Inheritance;

public class B extends A {
	 public void m2() {
		 System.out.println("m2");
		 

	}
	 public static void main(String[] args) {
			B a = new B();
			int c =a.m1(10,20,30);
			System.out.println(c);
		}

}
	
