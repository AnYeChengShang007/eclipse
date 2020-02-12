package com.fjx.lanqiaobei2016;

public class Main {
	
	static int[] a= {0,1,2,3,4,5,6,7,8,9};
	static int t;
	static int sum=0;
	public static void f(int k) {
		if(k==10) {
			if(check()) {
				sum++;
			}
		}
		
		
		for(int i=k; i<a.length;i++) {
			t=a[i];a[i]=a[k];a[k]=t;
			f(k+1);
			t=a[i];a[i]=a[k];a[k]=t;
		}
	}
	
	public static void main(String[] args) {
		f(0);
		System.out.println(sum);
		
	}
	
	public static boolean check() {
		
		if(
				Math.abs(a[0]-a[4])==1 || Math.abs(a[0]-a[4])==1 || Math.abs(a[0]-a[1])==1
				|| Math.abs(a[0]-a[5])==1 || Math.abs(a[1]-a[5])==1 ||Math.abs(a[1]-a[4])==1 ||
				Math.abs(a[1]-a[6])==1 ||Math.abs(a[2]-a[6])==1 ||Math.abs(a[2]-a[5])==1 ||
				Math.abs(a[3]-a[4])==1 ||Math.abs(a[1]-a[2])==1 ||Math.abs(a[4]-a[5])==1 ||
				Math.abs(a[5]-a[6])==1 ||Math.abs(a[3]-a[7])==1 ||Math.abs(a[3]-a[8])==1 ||
				Math.abs(a[4]-a[9])==1 ||Math.abs(a[4]-a[8])==1 ||Math.abs(a[4]-a[7])==1 ||
				Math.abs(a[5]-a[9])==1 ||Math.abs(a[6]-a[9])==1 ||Math.abs(a[7]-a[8])==1 ||
				Math.abs(a[8]-a[9])==1 || Math.abs(a[8]-a[5])==1||Math.abs(a[0]-a[3])==1 
				
				)
			return false;
				
				
		return true;
	}
	
	
}
