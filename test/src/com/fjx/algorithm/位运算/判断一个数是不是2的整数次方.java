package com.fjx.algorithm.位运算;

import java.util.Scanner;

public class 判断一个数是不是2的整数次方 {
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
			System.out.println(n+"是2的整数次方");
		}else {
			System.out.println(n+"不是2的整数次方");
		}
	}
}
