package com.fjx.lanqiaobei.c2017;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	
	static long[][] a = new long[30][30];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j] = (long) (sc.nextLong()*Math.pow(2, 29));
			}
		}
		for(int i=0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i+1][j] += a[i][j]/2;
				a[i+1][j+1] += a[i][j]/2;
			}
		}
		Arrays.sort(a[29]);
		System.out.println(Arrays.toString(a[29]));
	}

}
