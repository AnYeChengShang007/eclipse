package com.fjx;

import java.util.Scanner;

public class PasswordSusoect {
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		f(m,n);
		System.out.println(ans);
	}
	
	static void f(int m,int n) {
		
		if(m<n)
			return ;
		if(n==0) {
			ans++;
			return ;
		}
		
		f(m-1,n);
		f(m,n-1);
	}
	
	

}
