package com.fjx.algorithm.位运算;

import java.util.Random;

public class 二进制数的偶数为和奇数位交换 {
	public static void main(String[] args) {
		int n = new Random().nextInt();
		System.out.println(Integer.toBinaryString(n));
		int a = n&0xaaaaaaaa;
		int b = n&0x55555555;
		int m = (a>>>1)^(b<<1);
		System.out.println(Integer.toBinaryString(m));
	}
}
