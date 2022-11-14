package org.projectpractise;

public class PossiblePalindrome {
	public static void main(String[] args) {
		 int r = 0;
		 int temp = 0;
		 for(int a=99;a>0;a--) {
			 temp=a;
			 while(a>0) {
					int b = a/10;
					int c = a%10;
					r = c+(r*10);
					a = b;
			 }
			 if(temp==r) {
				 System.out.println(r);
			 }else {
				 System.out.println("not prime");
			 }
		
		 }
	}
}
		 
