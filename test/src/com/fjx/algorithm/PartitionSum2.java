package com.fjx.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class PartitionSum2 {
	
	static int[] a;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		dfs(k,0,new ArrayList<Integer>());
	}

	static void dfs(int k, int i,ArrayList<Integer> list) {
		
		if(k==0) {
			System.out.println(list);
			System.exit(0);
		}
		if(k<0 || i>=n) {
			return;
		}
		dfs(k,i+1,list);
		list.add(a[i]);
		int index = list.size()-1;
		dfs(k-a[i],i+1,list);
		list.remove(index);
	}
	
	

}
