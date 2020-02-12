package com.fjx.cg.package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	static long max;
	static long min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		for(int i=0;i<n;i++) {
			list1.add(sc.nextLong());
		}
		sc.nextInt();
		if(n==1) {
			System.out.println(list1.get(0));
			return;
		}
		Collections.sort(list1);
		list2.addAll(list1);
		while(list1.size()>1) {
			Long x = list1.remove(0);
			Long y = list1.remove(0);
			long s = x*y+1;
			list1.add(s);
			Collections.sort(list1);
		}
		max = list1.get(0);
		
		while(list2.size()>1) {
			Long x = list2.remove(list2.size()-1);
			Long y = list2.remove(list2.size()-1);
			long s = x*y+1;
			list2.add(s);
			Collections.sort(list2);
		}
		min = list2.get(0);
		System.out.println(max-min);
	}
	

}
