package com.fjx.cg.package2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	static int[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String string = Integer.toString(n);
		a = new int[string.length()];
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(string.charAt(i)+"");
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int t = a[0];
				a[0] = a[i];
				a[i] = t;
				break;
			}
		}
		int duibi = 0;
		for(int i=0;i<a.length;i++) {
			duibi = duibi*10+a[i];
		}
		if(duibi==m) {
			System.out.println("OK");
		}else {
			System.out.println("WRONG_ANSWER");
		}
	}
}
