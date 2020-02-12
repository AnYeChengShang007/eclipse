package com.fjx.lanqiaobeiA2015;

public class Main7_2 {
	
	static int ans;
	
	public static void main(String[] args) {
		f(0,0);
		System.out.println(ans);
	}
	
	static void f(int k,int num) {
		
		if(k>13||num>13)
			return;
		if(k==13&&num==13) {
			ans++;
		}
		
		for(int i=0;i<5;i++) {
			f(k+1,num+i);
		}
	}

}
