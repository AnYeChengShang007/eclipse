package com.fjx.test;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		float m = (float)max(a+b,b,c)/(max(a,b+c,c)+max(a, b, b+c));
		System.out.printf("%.2f",m);
	}
	static int max(int a,int b,int c) {
		int max = a;
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		return max;
	}

}
