package com.fjx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		List<Integer> a = new ArrayList<Integer>();
		String[] split = s1.split(" ");
		for(String s :split) {
			a.add(Integer.parseInt(s));
		}
		split = s2.split(" ");
		int[] b = new int[split.length];
		for(int i=0;i<b.length;i++) {
			b[i] = Integer.parseInt(split[i]);
		}
		for(int i=0;i<b.length;i++) {
			int index = a.indexOf(b[i]);
			a.remove(index);
			if(f(b[i],a)==-1) {
				System.out.println(b[i]);
				return;
			}
			a.add(index,b[i]);
		}
	}
	
	static int f(int num,List<Integer> list) {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(list);
		for(int i:list) {
			if(i%num==0||num%i==0) {
				int index = l.indexOf(i);
				l.remove(index);
				if(f(i,l)==-1) {
					return 1;
				}
				l.add(index, i);
			}
		}
		return -1;
	} 
}
