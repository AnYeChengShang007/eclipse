package com.fjx;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ReSortNinePalace {
	
	static Queue<Condition> q = new LinkedList<Condition>();
	static Set<String> set = new HashSet<String>();
	static int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1},
	};
	
	static String end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String begin = sc.nextLine();
		end = sc.nextLine();
		char[][] b = new char[3][3];
		Condition condition = new Condition();
		condition.s = begin;
		condition.step = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j] = begin.charAt(i*3+j);
				if(b[i][j]=='.') {
					condition.x = i;
					condition.y = j;
				}
			}
		}
		condition.condition = b;
		set.add(begin);
		BFS(condition);
		
	}
	
	static void BFS(Condition condition) {
		
		q.offer(condition);
		while(!q.isEmpty()) {
			Condition now = q.poll();
			
			if(now.s.equals(end)) {
				System.out.println(now.step);
				return;
			}
			
			for(int i=0;i<4;i++) {
				int newx = now.x+dir[i][0];
				int newy = now.y+dir[i][1];
				if(newx<0||newx>2||newy<0||newy>2)
					continue;
				char[][] newcs = copy(now.condition);
				char t = newcs[now.x][now.y];
				newcs[now.x][now.y] = newcs[newx][newy];
				newcs[newx][newy] = t;
				String string = toString(newcs);
				if(set.contains(string))
					continue;
				else {
					set.add(string);
					Condition con = new Condition();
					con.condition = newcs;
					con.s = string;
					con.x = newx;
					con.y = newy;
					con.step = now.step+1;
					q.offer(con);
				}
			}
		}
		System.out.println(-1);
	}
	
	static class Condition{
		int step;
		int x;
		int y;
		char[][] condition;
		String s;
	}
	
	static char[][] copy(char[][] cs){
		char[][] a= new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = cs[i][j];
			}
		}
		return a;
	}
	
	static String toString(char[][] cs) {
		String s = "";
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				s+=cs[i][j];
			}
		}
		return s;
	}

}
