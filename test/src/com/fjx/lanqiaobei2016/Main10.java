package com.fjx.lanqiaobei2016;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main10 {
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] nums2 = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			Integer num = map.get(nums[i]);
			if(num!=null) {
				int ans = count(nums,num,i);
				nums2[i] = ans;
			}else {
				nums2[i] = -nums[i];
			}
			map.put(nums[i], i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.println();
	}
	
	static int count(int[] a,int i,int j) {
		Set<Integer> set = new HashSet<Integer>();
		for(int r=i+1;r<j;r++) {
			set.add(a[r]);
		}
		return set.size();
	}

}
