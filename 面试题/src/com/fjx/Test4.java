package com.fjx;

public class Test4 {
	
	public static void main(String[] args) {
		int[] a1= {1,2,9,82};
		int[] a2= {3,4,6};
		double function = function(a1,a2);
		System.out.println(function);
	}
	
	public static double function(int[] a1, int[] a2 ) {
		int len = a1.length+a2.length;
		if(len==2) {
			int mid = 0;
			for(int a:a1) {
				mid+=a;
			}
			for(int a:a2) {
				mid+=a;
			}
			return mid*1.0/2;
		}else if(len==1){
			if(a1.length==1) {
				return a1[0];
			}else {
				return a2[0];
			}
		}
		
		if(a1.length==0) {
			int[] b2 = new int[a2.length-2];
			System.arraycopy(a2, 1, b2, 0, a2.length-2);
			return function(a1,b2);
		}
		if(a2.length==0) {
			int[] b1 = new int[a1.length-2];
			System.arraycopy(a1, 1, b1, 0, a1.length-2);
			return function(b1,a2);
		}
		
		
		if(a1[0]<a2[0] && a1.length!=0 && a2.length!=0) {
			if(a1[a1.length-1]<a2[a2.length-1]) {
				int[] b1 = new int[a1.length-1];
				System.arraycopy(a1, 1, b1, 0, a1.length-1);
				int[] b2 = new int[a2.length-1];
				System.arraycopy(a2, 0, b2, 0, a2.length-1);
				return function(b1,b2);
			}else {
				int[] b1 = new int[a1.length-2];
				System.arraycopy(a1, 1, b1, 0, a1.length-2);
				return function(b1,a2);
			}
		}else {
			if(a1[a1.length-1]<a2[a2.length-1]) {
				int[] b2 = new int[a2.length-2];
				System.arraycopy(a2, 1, b2, 0, a2.length-2);
				return function(a1,b2);
			}else {
				int[] b1 = new int[a1.length-1];
				System.arraycopy(a1, 0, b1, 0, a1.length-1);
				int[] b2 = new int[a2.length-1];
				System.arraycopy(a2, 1, b2, 0, a2.length-1);
				return function(b1,b2);
			}
		}
	}
}

