package com.fjx;

import java.util.Scanner;

public class Monk {
	
	static int n ;
	static int ans1,ans2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		n = Integer.parseInt(ss[ss.length-1]);
		boolean[] a = new boolean[n];
		a[n-1] = true;
		for(int i=0;i<ss.length;i++) {
			a[Integer.parseInt(ss[i])-1] = true;
		}
		if(f(a)) {
			System.out.println(ans1+" "+ans2);
		}else {
			System.out.println(-1);
		}
	}
	
	static boolean f(boolean[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]) {
						break;
					}else {
						a[i] = false;
						a[j] = true;
						if(!f(a)) {
							a[i] = true;
							a[j] = false;
							ans1 = i+1;
							ans2 = j+1;
							return true;
						}else {
							a[i] = true;
							a[j] = false;
						}
					}
				}
			}
		}
		return false;
	}

}
