package com.fjx.algorithm.λ����;

import java.util.Scanner;

public class �ж�һ�����ǲ���2�������η� {
	/*
	 * 1	0
	 * 10	01 
	 * 100	011
	 * 1000	0111
	 * 1001 1000
	 * 11	10
	 */
	public static void main(String[] args) {
		function();
	}
	
	public static void function() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n&(n-1))==0) {
			System.out.println(n+"��2�������η�");
		}else {
			System.out.println(n+"����2�������η�");
		}
	}
}
