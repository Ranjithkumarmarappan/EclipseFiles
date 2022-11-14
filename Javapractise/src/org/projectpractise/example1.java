package org.projectpractise;

public class example1 {
	
	public static void main(String[] args) {
		int  a = 121;
		int temp = a;
		int r = 0;
		int sum = 0;
		int count = 0;
		while(a>0) {
			int b = a/10;
			int c = a%10;
			r = c+(r*10);
			
			a = b;
		    sum = sum+c;
		    count++;
		}
		if(temp==r) {
			System.out.println("Given Num is Palindrome");
		}else {
			System.out.println("Given num is Not a Palindrome");
		}
		System.out.println("Reverse the Number is "+r);
		System.out.println("Sum of the Number is "+ sum);
		System.out.println("Count of Numbers is "+ count);
	}
	

}
