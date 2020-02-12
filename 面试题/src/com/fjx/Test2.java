package com.fjx;

import java.util.LinkedList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		list2.add(6);
		List<Integer> list = jisuan(list1, list2);
		System.out.println(list);
		 
		
	}
	
	public static List jisuan(List<Integer> list1,List<Integer> list2) {
		List<Integer> list = new LinkedList<Integer>();
		int jinwei = 0;
		while(!list1.isEmpty() && !list2.isEmpty()) {
			int i = list1.remove(0)+list2.remove(0) + jinwei;
			if(i>=10) {
				jinwei = i/10;
				list.add(i%10);
				
			}else {
				list.add(i);
				jinwei = 0;
			}
		}
		if(list1.isEmpty()) {
			list2.add(0, list2.remove(0)+jinwei);
		}else {
			list1.add(0, list1.remove(0)+jinwei);
		}
		
		while(!list1.isEmpty()) {
			list.add(list1.remove(0));
		}
		while(!list2.isEmpty()) {
			list.add(list2.remove(0));
		}
		
		return list;
	}

}
