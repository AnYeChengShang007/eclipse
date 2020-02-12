package com.fjx.algorithm;

import java.util.HashSet;
import java.util.Set;

public class EightNumberCode2 {
	
	static Set<Condition> set = new HashSet<Condition>();
	
	static Condition end;
	static {
		int[][] l = {
				{1,2,3},
				{8,0,4},
				{7,6,5}
		};
		end = new Condition(1, 1, l);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		int[][] b = {
				{1,2,3},
				{8,0,4},
				{7,6,5}
		};
		Condition start = new Condition(1, 1, b);
		set.add(start);
		dfs(start);
		
	}

	static void dfs(Condition c) throws CloneNotSupportedException {
		
		if(end.equals(c)) {
			System.out.println("ok");
			return;
		}
		
		if(c.i+1<3) {
			Condition n = (Condition) c.clone();
			n.swap(c.i, c.j, c.i+1, c.j);
			n.i++;
			if(ok(n)) {
				dfs(n);
			}
		}
		if(c.i-1>=0) {
			Condition n = (Condition) c.clone();
			n.swap(c.i, c.j, c.i-1, c.j);
			n.i--;
			if(ok(n)) {
				dfs(n);
			}
		}
		if(c.j+1<3) {
			Condition n = (Condition) c.clone();
			n.swap(c.i, c.j, c.i, c.j+1);
			n.j++;
			if(ok(n)) {
				dfs(n);
			}
		}
		if(c.j-1>=0) {
			Condition n = (Condition) c.clone();
			n.swap(c.i, c.j, c.i, c.j-1);
			n.j--;
			if(ok(n)) {
				dfs(n);
			}
		}
	}
	
	static boolean ok(Condition c) {
		if(set.contains(c)) {
			return false;
		}else {
			set.add(c);
			return true;
		}
	}
	
	static class Condition implements Cloneable{
		int i;int j;int[][] a;
		String s;
		public Condition(int i, int j, int[][] a) {
			this.i = i;
			this.j = j;
			this.a = a;
			String t = "";
			for(int z=0;z<3;z++) {
				for(int x=0;x<3;x++) {
					t+=a[z][x];
				}
			}
			s = t;
		}
		
		

		@Override
		public int hashCode() {
			return this.s.hashCode();
		}



		@Override
		public boolean equals(Object obj) {
			Condition c = (Condition) obj;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(a[i][j]!=c.a[i][j]) {
						System.out.println(false+"111");
						return false;
					}
				}
			}
			if(this.i==c.i && this.j==c.j) {
				return true;
			}
			return false;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			int[][] copy = new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					copy[i][j] = a[i][j];
				}
			}
			Condition c = new Condition(i, j, a);
			return new Condition(i, j, copy);
		}
		void swap(int i1,int j1,int i2,int j2) {
			a[i1][j1]^=a[i2][j2];
			a[i2][j2]^=a[i1][j1];
			a[i1][j1]^=a[i2][j2];
			String t = "";
			for(int z=0;z<3;z++) {
				for(int x=0;x<3;x++) {
					t+=a[z][x];
				}
			}
			s = t;
		}
	}
}
