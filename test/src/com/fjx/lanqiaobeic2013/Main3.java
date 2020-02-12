package com.fjx.lanqiaobeic2013;

public class Main3 {
	
	public static void main(String[] args) {
		System.out.println(f(1,1)+f(2,1));
	}

	
	static int f(int step,int foot) {
		if(step==39&&foot==0) {
			return 1;
		}
		if(step==39&&foot==1||step>39)
			return 0;
		
		return f(step+1,1-foot)+f(step+2,1-foot);
	}
}
