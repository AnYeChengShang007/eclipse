package com.fjx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class PanCake {
	
	public static void main(String[] args) throws IOException {
		List<String[]> list = new LinkedList<String[]>();
		InputStream stream = PanCake.class.getClassLoader().getResourceAsStream("com/fjx/pancake");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(stream)
				);
		String s;
		while(null!=(s=br.readLine())) {
			String[] split = s.split(" ");
			list.add(split);
		}
		for(int i=0;i<list.size();i++) {
			process(list.get(i));
		}
	}
	
	public static void process(String[] s) {
		List<Integer> list = new LinkedList<Integer>();
		int max = -1;
		int min = 40;
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		int[] a = new int[s.length];
		for(int i=0;i<a.length;i++) {
			int num = Integer.parseInt(s[i]);
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			a[i] = num;
		}
		int max_p = -1;
		int min_p = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==max) {
				max_p = i;
			}
		}
		
		if(max_p!=a.length-1) {
			if(max_p!=0) {
				reverse(max_p,a);
				list.add(max_p+1);
				max_p = 0;
			}
			reverse(max_p,a);
			list.add(max_p+1);
			max_p = a.length-1;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==min) {
				min_p = i;
			}
		}
		
		if(min_p!=0) {
			reverse(min_p,a);
			list.add(min_p+1);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(0);
		
	}
	
	public static void reverse(int max_p,int[] a) {
		int i = max_p;
		int j = a.length-1;
		while(i<j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i++;
			j--;
		}
	}

}
