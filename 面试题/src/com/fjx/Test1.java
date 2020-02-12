package com.fjx;

public class Test1 {
	
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		findAnswer(arr);
		
		
	}
	
	public static void findAnswer(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i!=j && arr[i]+arr[j]==9) {
					System.out.println("["+i+","+j+"]"); 
					return;
				}
			}
		}
		
	}

}
