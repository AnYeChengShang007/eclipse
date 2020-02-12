package com.fjx.cg.package1;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n];
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			int sum=0,maxsum=0,begin=0,end=0,k=0;
			int[] a = new int[num];
			for(int j=0;j<num;j++) {
				a[j] = sc.nextInt();
			}
			for(int j=0;j<num;j++) {
				sum+=a[j];
				if(sum>maxsum) {
					begin = k;
					maxsum = sum;
					end = j;
				}
				if(sum<0) {
					k = j+1;
					sum = 0;
				}
			}
			ss[i] = "Case "+(i+1)+":\n"+maxsum+" "+(begin+1)+" "+(end+1);
		}
		for(int i=0;i<n;i++) {
			System.out.println(ss[i]);
		}
	}

}
