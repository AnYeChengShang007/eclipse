package com.fjx.lanqiaobei2018;

import java.util.Scanner;

public class Main7_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		System.out.println(dis(x,y));
		
	}
	
	static long dis(long x,long y) {
		long ans = 0;
		if(x+y<=0) {
			if(y>=x+1) {
				ans = 4*(x*x)-2*Math.abs(x)-((2*Math.abs(x)-1)/2+1-y);
			}else{
				ans = 4*y*y-5*Math.abs(y)+1-x;
			}
		}else {
			if(x<=y) {
				ans = 4*y*y+x-Math.abs(y);
			}else {
				ans = 4*x*x-y;
			}
		}
		return ans;
	}

}
