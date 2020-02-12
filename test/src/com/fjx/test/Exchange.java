package com.fjx.test;

public class Exchange {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println(a+"  "+b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a+"  "+b);
	}
}
