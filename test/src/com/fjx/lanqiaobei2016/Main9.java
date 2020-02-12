package com.fjx.lanqiaobei2016;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {

	static int[] a = new int[3];
	static int[] b = new int[5];
	static int sum1;
	static int sum2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(f(1,0,0));
	}

	public static String f(int total, int me,int you) {
		String flag = "-";
		
		if(total<a[0]) {
			
			if((me&1)==1) {
				if((you&1)!=1)
					return "+";
				else 
					return "0";
			}else {
				if((you&1)==1)
					return "-";
				else
					return "0";
			}
			
		}
		
		
		for(int i=0; i<3; i++) {
			
			if(total>=a[i]) {
				if(f(total-a[i],you,me+a[i]).equals("-")) {
					return "+";
				}else if(f(total-a[i],you,me+a[i]).equals("0")) {
					return "0";
				}
			}
		}
		
		return flag;
	}

}
