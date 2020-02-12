package com.fjx;

import java.util.Scanner;

public class MixedNumber {
	
	static int ans;
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int Q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q = sc.nextInt();
		f(0);
		System.out.println(ans);
	}
	
	static void f(int k) {
		
		if(k==8) {
			check();
			return;
		}
		
		for(int i=k;i<9;i++) {
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			f(k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}

	static void check() {
		for(int i=1;i<=4;i++) {
			for(int j=8;j>=5;j--) {
				int num1 = 0;
				for(int k=0;k<i;k++) {
					num1 = num1*10+a[k];
				}
				int num2 = 0;
				for(int k=i;k<j;k++) {
					num2 = num2*10+a[k];
				}
				int num3 = 0;
				for(int k=j;k<9;k++) {
					num3 = num3*10+a[k];
				}
				if(num2%num3==0) {
					if(num1+num2/num3==Q) {
						ans++;
					}
				}
			}
		}
	}

}
