package com.fjx.algorithm.λ����;

import java.util.Random;

public class ����������ż��Ϊ������λ���� {
	public static void main(String[] args) {
		int n = new Random().nextInt();
		System.out.println(Integer.toBinaryString(n));
		int a = n&0xaaaaaaaa;
		int b = n&0x55555555;
		int m = (a>>>1)^(b<<1);
		System.out.println(Integer.toBinaryString(m));
	}
}
