package com.fjx.test;

import java.util.Arrays;
import java.util.Random;

public class OnlyOneNumber {
	
	public static void main(String[] args) {
		int[] a = new int[1001];
		for(int i=0;i<1000;i++) {
			a[i] = i+1;
		}
		int rand = new Random().nextInt(1000-1)+1;
		a[1000] = rand;
		System.out.println(Arrays.toString(a));
		rand = new Random().nextInt(1000);
		a[rand]^=a[1000];
		a[1000]^=a[rand];
		a[rand]^=a[1000];
		System.out.println(Arrays.toString(a));
		int x = 0;
		for(int i=1;i<=1000;i++) {
			x^=i;
		}
		for(int i=0;i<=1000;i++) {
			x^=a[i];
		}
		System.out.println(x);
		
	}

}
