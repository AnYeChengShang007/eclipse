package com.fjx.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list= new ArrayList<Integer>();
		int num = 0;
		while(0!=(num=sc.nextInt())) {
			list.add(num);
		}
		for(int i=0;i<list.size();i++) {
			f(list.get(i));
		}
	}
	
	public static void f(int a) {
		int max = 0;
		int maxi = 0;
		for(int i=2;i<a;i++) {
			int p = f2(i,a);
			if(p!=-1) {
				max = i;
				maxi = p;
			}
		}
		System.out.println(max+" "+maxi);
	}
	
	public static int f2(int a,int b) {
		
		for(int i=2;;i++) {
			int t = (int) Math.pow(a, i);
			if(t==b) {
				return i;
			}else if(t>b) {
				return -1;
			}
			
		}
	}
}
