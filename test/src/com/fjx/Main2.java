package com.fjx;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		
		for(int n=17;n<=21;n++) {
			int m = n*n*n;
			int k = n*n*n*n;
			while(m!=0) {
				set.add(m%10);
				m/=10;
			}
			while(k!=0) {
				set.add(k%10);
				k/=10;
			}
			if(set.size()==10) {
				System.out.println(n);
			}
			set.clear();
		}
		
		
	}
}
