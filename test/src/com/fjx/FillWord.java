package com.fjx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillWord {
	
	static List<Integer> ans = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] ss = new String[n];
		for(int i=0;i<n;i++) {
			ss[i] = sc.nextLine();
		}
		for(String s:ss) {
			ans.add(f(s));
		}
		for(int i:ans) {
			System.out.println(i);
		}
	}

	static int f(String s) {
		
		if(s.contains("LOL")) {
			return -1;
		}
		if(!s.contains("*")) {
			return 0;
		}
		
		int flag = -1;
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='*') {
				s1[i] = 'L';
				int d1 = f(new String(s1));
				if(d1==-1)
					return 1;
				s1[i] = 'O';
				int d2 = f(new String(s1));
				if(d2==-1)
					return 1;
				if(d1==0)
					flag = 0;
				if(d2==0)
					flag = 0;
				s1[i] = '*';
			}
		}
		
		return flag;
	}
	
	

}
