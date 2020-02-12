package com.fjx.cg.package1;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Sequence {
	static int a;
	static int b;
	static int num;
	static int[][] m1 = new int[2][2];
	static int[][] m2 = new int[2][2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			num = sc.nextInt();
			if(a==0) break;
			if(num==1||num==2) {
				System.out.println(1);
				continue;
			}else {
				m1[0][0] = a;
				m1[0][1] = b;
				m1[1][0] = 1;
				m2[0][0] = a;
				m2[0][1] = b;
				m2[1][0] = 1;
				multi(m1, m2, num);
				System.out.println((m1[0][0]+m1[0][1])%7);
			}
			
		}
	}
	
	static void multi(int[][] a,int[][]b,int num) {
		for(int k=0;k<num-3;k++) {
			int A = a[0][0]*b[0][0]%7+a[0][1]*b[1][0]%7;
			int B = a[0][0]*b[0][1]%7+a[0][1]*b[1][1]%7;
			int C = a[1][0]*b[0][0]%7+a[1][1]*b[1][0]%7;
			int D = a[1][0]*b[0][1]%7+a[1][1]*b[1][1]%7;
			a[0][0] = A;
			a[0][1] = B;
			a[1][0] = C;
			a[1][1] = D;
		}
	}
	
}
