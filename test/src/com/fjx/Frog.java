package com.fjx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Frog {
	static String end;
	static char[] start;
	static int[] dir = {-1,1,-2,2,-3,3};
	static int len;
	static Queue<Condition> q = new LinkedList<Condition>();
	static Set<String> set = new HashSet<String>();
	
	static class Condition{
		char[] s;
		int p;
		int step;
		public Condition(char[] s, int p,int step) {
			this.s = s;
			this.p = p;
			this.step = step;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String start_s = sc.nextLine();
		int index = start_s.indexOf('*');
		start = start_s.toCharArray();
		len = start.length;
		end = sc.nextLine();
		set.add(new String(start_s));
		Condition c = new Condition(start, index,0);
		BFS(c);
	}

	static void BFS(Condition c) {
		q.offer(c);
		while(!q.isEmpty()) {
			Condition now = q.poll();
			char[] cs = Arrays.copyOf(now.s, now.s.length);
			if(new String(cs).equals(end)) {
				System.out.println(now.step);
				return;
			}
			
			for(int i=0;i<6;i++) {
				int j = now.p+dir[i];
				if(j>=0&&j<len) {
					cs = Arrays.copyOf(now.s, now.s.length);
					char ch = cs[j];
					cs[j] = cs[now.p];
					cs[now.p] = ch;
					if(!set.contains(new String(cs))) {
						set.add(new String(cs));
						Condition next = new Condition(cs, j,now.step+1);
						q.offer(next);
					}
				}
			}
		}
	}
	

}
