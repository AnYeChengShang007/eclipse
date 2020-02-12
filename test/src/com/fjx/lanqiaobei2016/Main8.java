package com.fjx.lanqiaobei2016;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		f();
	}
	
	
	public static void f() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int a=0;a<Math.sqrt(N);a++) {
			for(int b=a;b<Math.sqrt(N);b++) {
				for(int c=b;c<Math.sqrt(N);c++) {
					for(int d=c;d<Math.sqrt(N);d++) {
						if(a*a+b*b+c*c+d*d==N) {
							System.out.println(a+" "+b+" "+c+" "+d);
							return;
						}
					}
				}
			}
		}
	}
}
