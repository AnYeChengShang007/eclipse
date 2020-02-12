package com.fjx.test;

import java.util.Scanner;

public class TheNumberOfOne {
	public static void main(String[] args) {
		f2();
	}
	
	static void f1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=32;i++) {
			if(((n>>i) & 1)==1)
				count++;
		}
		System.out.println(count);
	}
	
	static void f2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int x = 1;
		for(int i=0;i<32;i++) {
			if((n&x)==x)
				count++;
			x<<=1;
		}
		System.out.println(count);
	}
}
