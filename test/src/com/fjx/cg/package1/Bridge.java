package com.fjx.cg.package1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Bridge {
	static int nn;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while(!(s = sc.nextLine()).equals("")) {
			String[] split = s.split(" ");
			int n = Integer.parseInt(split[0]);
			int m = Integer.parseInt(split[1]);
			int k = Integer.parseInt(split[2]);
			int[] bridge = new int[n];
			int[] time = new int[n];
			int[] last = new int[n];
			int[][] water = new int[2][m];
			for(int i=0;i<n;i++) {
				bridge[i] = sc.nextInt();
				if(bridge[i]<=1) {
					last[i] = 1;
				}
			}
			for(int i=0;i<m;i++) {
				water[0][i] = sc.nextInt();
				water[1][i] = sc.nextInt();
				check(bridge, time, last, water[0][i], water[1][i]);
			}
			sc.nextLine();
			System.out.println("Case "+((nn++)+1)+": "+count(time, k));
		}
	}
	
	static int count(int[] time,int k) {
		int sum = 0;
		for(int i=0;i<time.length;i++) {
			if(time[i]>=k)
				sum++;
		}
		return sum;
	}
	
	static void check(int[] bridge,int[] time,int[] last,int up,int down) {
		for(int i=0;i<bridge.length;i++) {
			if(last[i]!=1 && up>=bridge[i]) {
				time[i]++;
			}
			if(down<bridge[i]) {
				last[i] = 0;
			}else {
				last[i] = 1;
			}
		}
	}
	
	@Test
	public void test() throws Exception {
		int[] a = {2,3,6,8};
		System.out.println(Arrays.binarySearch(a, 1));
	}
}
