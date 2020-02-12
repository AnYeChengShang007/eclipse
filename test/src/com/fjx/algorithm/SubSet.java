package com.fjx.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SubSet {
	static int[] a = {1,2,3};
	public static void main(String[] args) {
//		System.out.println(getSubSet(2));
//		System.out.println(getSubSet2(2));
		System.out.println(getSubSet3(2));
	}
	
	static Set<HashSet<Integer>> getSubSet2(int index){
		Set<HashSet<Integer>> new_set = null;
		Set<HashSet<Integer>> res = new HashSet<HashSet<Integer>>();
		res.add(new HashSet<Integer>());
		for(int i=0;i<=index;i++) {
			new_set = new HashSet<HashSet<Integer>>();
			new_set.addAll(res);
			for(HashSet<Integer> set:res) {
				HashSet<Integer> clone = (HashSet<Integer>) set.clone();
				clone.add(a[i]);
				new_set.add(clone);
			}
			res = new_set;
		}
		return new_set;
	}
	
	static Set<HashSet<Integer>> getSubSet(int index) {
		Set<HashSet<Integer>> new_set = new HashSet<HashSet<Integer>>();
		if(index==0) {
			new_set.add(new HashSet<Integer>());
			HashSet<Integer> ha =  new HashSet<Integer>();
			ha.add(a[index]);
			new_set.add(ha);
			return new_set;
		}
		Set<HashSet<Integer>> old = getSubSet(index-1);
		for(HashSet<Integer> set:old) {
			HashSet<Integer> clone = (HashSet<Integer>) set.clone();
			clone.add(a[index]);
			new_set.add(clone);
		}
		new_set.addAll(old);
		return new_set;
	}
	
	static List<LinkedList<Integer>> getSubSet3(int index){
		List<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
		int total = (int) (Math.pow(2, 3)-1);
		for(int i=total;i>=1;i--) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int j=2;j>=0;j--) {
				if(((i>>j) & 1)==1) {
					list.add(a[j]);
				}
			}
			res.add(list);
		}
		return res;
	}
}
