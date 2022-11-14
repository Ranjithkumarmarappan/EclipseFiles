package org.projectpractise;

public class TestPrac{
	public void movingValues(int[] arr) {
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count < arr.length) {
			arr[count++] = 0;
		}
	}
	public static void main(String[] args) {
		TestPrac t = new TestPrac();
		  int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		  t.movingValues(arr);
		  	for(int i=0; i<arr.length;i++) {
		  		System.out.print(arr[i]+" ");
		  	}
		
	}	

}