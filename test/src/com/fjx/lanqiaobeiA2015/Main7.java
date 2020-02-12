package com.fjx.lanqiaobeiA2015;

public class Main7 {
	
	static int[] b = {4,4,4,4,4,4,4,4,4,4,4,4,4}; 
	static int ans;
	
	public static void main(String[] args) {
		for(int i=0;i<13;i++) {
			b[i]--;
			f(1);
			b[i]++;
		}
		System.out.println(ans);
	}
	
	static void f(int k) {
		
		if(k==13) {
			ans++;
			return;
		}
		
		for(int i=0;i<13;i++) {
			if(b[i]>0) {
				b[i]--;
				f(k+1);
				b[i]++;
			}
		}
	}

}
