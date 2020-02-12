package com.fjx.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PartitionSum {
	
	static int[] a;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(a);
		for(int i=(int) Math.pow(2,n)-1;i>=1;i--) {
			List<Integer> res = new ArrayList<Integer>();
			for(int j=n-1;j>=0;j--) {
				if(((i>>j) & 1)==1) {
					res.add(a[j+1]);
				}
			}
			list.add((ArrayList<Integer>) res);
		}
		for(List<Integer> e:list) {
			if(sum((ArrayList<Integer>) e)==k) {
				System.out.println(e);
				return;
			}
		}
	}
	
	
	

	
	static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for(int num:list) {
			sum+=num;
		}
		return sum;
	}

}
