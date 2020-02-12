package com.fjx;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		long multiple = 1;
		
		for(int i=0; i<29; i++) {
			multiple<<=1;
		}
		
		
		Scanner sc = new Scanner(System.in);
		long[][] a = new long[30][30];
		for(int i=0; i<29; i++) {
			for(int j=0; j<=i; j++) {
				int nextInt = sc.nextInt();
				a[i][j] = nextInt*multiple;
			}
		}
		
		for(int i=0; i<29; i++) {
			for(int j=0; j<=i; j++) {
				long s = a[i][j]/2;
				a[i+1][j] +=s;
				a[i+1][j+1]+=s;
			}
		}
		
		for(int i=0; i<30; i++) {
			System.out.println(a[29][i]);
		}
		Arrays.sort(a[29]);
		System.out.println(a[29][29]);
		
	}
	
}
