package com.fjx.cg.package2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class MainE {
	
	static int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1},
			{-1,-1},
			{-1,1},
			{1,-1},
			{1,1}
	};
	static int c2;
	static int r2;
	
	static Queue<Condition> q = new LinkedList<Condition>(); 
	static Set<Condition> set = new HashSet<Condition>();
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d1 = sc.nextLine();
		String d2 = sc.nextLine();
		int c1 = d1.charAt(0)-'a';
		int r1 = d1.charAt(1)-'1';
		c2 = d2.charAt(0)-'a';
		r2 = d2.charAt(1)-'1';
		Condition c = new Condition(r1, c1,0);
		BFS(c);
	}
	
	static void BFS(Condition c) {
		q.offer(c);
		while(q.size()>0) {
			Condition now = q.poll();
			if(now.c==c2 && now.r==r2) {
				System.out.println(now.step);
				return;
			}
			for(int i=0;i<8;i++) {
				int newr = now.r+dir[i][0];
				int newc = now.c+dir[i][1];
				Condition next = new Condition(newr,newc, now.step+1);
				if(newr>=0 && newr<8 && newc>=0 && newc<8 && newr>=0 && !set.contains(next)) {
					q.offer(next);
				}
			}
		}
	}
	
	static class Condition{
		int r;
		int c;
		int step;
		public Condition(int r, int c,int step) {
			super();
			this.r = r;
			this.c = c;
			this.step = step;
		}
		@Override
		public String toString() {
			return "Condition [r=" + r + ", c=" + c + "]";
		}
		
		
		public boolean equals(Object obj) {
			if(((Condition)obj).c==this.c && ((Condition)obj).r==this.r)
				return true;
			return false;
		}
		
		
	}

}
