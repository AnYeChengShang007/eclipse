package com.fjx;

import java.util.Scanner;

public class Test1434 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int h = Math.abs((m+w-1)/w-(n+w-1)/w);
		int p1 = 0;
		int p2 = 0;
		if((((m-1)/w)&1)==0) {
			p1 = (m-1)%w;
		}else {
			p1 = w-(m-1)%w-1;
		}
		if((((n-1)/w)&1)==0) {
			p2 = (n-1)%w;
		}else {
			p2 = w-(n-1)%w-1;
		}
		int wid = Math.abs(p1-p2);
		System.out.println(h+wid);
	}
	
	

}
