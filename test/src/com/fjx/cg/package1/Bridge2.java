package com.fjx.cg.package1;

import java.util.Arrays;
import java.util.Scanner;

public class Bridge2 {
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
			for(int i=0;i<n;i++) {
				bridge[i] = sc.nextInt();
			}
			Arrays.sort(bridge);
			int h1 = 1;
			int h2 = sc.nextInt();
			int index1 = Arrays.binarySearch(bridge, h1);
			int index2 = Arrays.binarySearch(bridge, h2);
			if(index1<0) {
				index1 = -(index1+1);
			}else {
				index1++;
			}
			if(index2<0) {
				index2 = -(index2+1);
			}else {
				index2++;
			}
			if(index1>=0&&index1<n)
				time[index1]++;
			if(index2>=0&&index2<n)
				time[index2]--;
			for(int i=0;i<m-1;i++) {
				h1 = sc.nextInt();
				h2 = sc.nextInt();
				index1 = Arrays.binarySearch(bridge, h1);
				index2 = Arrays.binarySearch(bridge, h2);
				if(index1<0) {
					index1 = -(index1+1);
				}else {
					index1++;
				}
				if(index2<0) {
					index2 = -(index2+1);
				}else {
					index2++;
				}
				if(index1>=0&&index1<n)
					time[index1]++;
				if(index2>=0&&index2<n)
					time[index2]--;
			}
			sc.nextInt();
			sc.nextLine();
			int sum = 0;
			int r = 0;
			for(int i=0;i<n;i++) {
				sum+=time[i];
				if(sum>=k)
					r++;
			}
			System.out.println("Case "+((nn++)+1)+": "+r);
		}
	}
}
