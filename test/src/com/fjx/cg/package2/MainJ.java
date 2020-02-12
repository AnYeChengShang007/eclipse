package com.fjx.cg.package2;

import java.util.Scanner;

public class MainJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		long i = n/a;
		if(a*i!=n)
			i++;
		long j = m/a;
		if(a*j!=m)
			j++;
		System.out.println(i*j);
	}
}
