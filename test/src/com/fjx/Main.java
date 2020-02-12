package com.fjx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = fun2(a,b);
		s = fun2(s,c);
		System.out.println(s);
		
	}
	
	public static int fun2(int i,int j) {
		return i*j/(fun(i,j));
	}
	
	public static int fun(int i, int j) {
		while(j!=0) {
			int r=i%j;
			i=j;
			j=r;
		}
		return i;
	}

}
