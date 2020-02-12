package com.fjx.lanqiaobei2018;

import java.math.BigInteger;

public class Main2 {
	
	public static void main(String[] args) {
		int r=1000;
		int sum=0;
		for(int i=1;i<=r;i++) {
			int a = (int)Math.sqrt(r*r-i*i);
			sum+=a;
		}
		System.out.println(sum*4);
	}

}


