package com.fjx.algorithm.λ����;

import java.util.Scanner;

public class ��������1�ĸ��� {
	public static void main(String[] args) {
//		function1();
		function2();
	}
	
	public static void function1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=0;i<32;i++) {
			if((n&1)!=0) {
				count++;
			}
			n>>>=1;
		}
		System.out.println(count);
	}
	
	public static void function2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n!=0) {
			count++;
			n&=(n-1);
		}
		System.out.println(count);
	}
}
