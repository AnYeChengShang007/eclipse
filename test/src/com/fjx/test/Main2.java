package com.fjx.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = 0;
		while(0!=(n=sc.nextLong())) {
			f(n);
		}
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	static void f(long n) {
		long s = n;
		int i=1;
		while(true) {
			n=s*i;
			if(check(n)) {
				list.add(s+": "+n);
				break;
			}
			i++;
		}
	}
	
	static boolean check(long n) {
		boolean f1 = false;
		boolean f2 = false;
		int num = 0;
		char[] cs = (n+"").toCharArray();
		if(cs.length<2)
			return false;
		for(int i=1;i<cs.length;i++) {
			if(cs[i]!=cs[i-1]) {
				num++;
				if(num>=2) {
					return false;
				}
			}
		}
		return true;
	}

}
