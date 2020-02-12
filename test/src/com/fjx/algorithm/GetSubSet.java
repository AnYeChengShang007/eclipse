package com.fjx.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class GetSubSet {
	
	public static void main(String[] args) {
		System.out.println(getSubSet2(2));
		
	}
	
	static int[] a = {1,2,3};
	
	static Set<HashSet<Integer>>getSubSet1(int k) {
		Set<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();
		if(k==0) {
			HashSet<Integer> t = new HashSet<Integer>();
			HashSet<Integer> t2 = new HashSet<Integer>();
			t2.add(a[k]);
			set.add(t);
			set.add(t2);
			return set;
		}else {
			Set<HashSet<Integer>> old = getSubSet1(k-1);
			for(HashSet<Integer> t:old) {
				HashSet<Integer> clone = (HashSet<Integer>) t.clone();
				clone.add(a[k]);
				set.add(clone);
			}
			set.addAll(old);
		}
		return set;
	}
	
	static Set<HashSet<Integer>> getSubSet(int k){
		Set<HashSet<Integer>> res = null;
		Set<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();
		set.add(new HashSet<Integer>());
		for(int i=0;i<=k;i++) {
			res = new HashSet<HashSet<Integer>>();
			res.addAll(set);
			for(HashSet<Integer> t: set) {
				HashSet<Integer> clone = (HashSet<Integer>) t.clone();
				clone.add(a[i]);
				res.add(clone);
			}
			set = res;
		}
		return res;
	}
	
	static List<ArrayList<Integer>> getSubSet2(int k){
		List<ArrayList<Integer>> res = new LinkedList<ArrayList<Integer>>();
		int t = (int) Math.pow(2, a.length)-1;
		for(int i=t;i>=1;i--) {
			ArrayList<Integer> s = new ArrayList<Integer>();
			for(int j=a.length-1;j>=0;j--) {
				if(((i>>j)&1)==1) {
					s.add(a[j]);
				}
			}
			res.add(s);
		}
		return res;
	}

}
