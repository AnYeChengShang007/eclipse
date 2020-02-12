package com.fjx.cg.package1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Qipan2 {
	static int time = 1;
	
	static int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1},
			{-1,-1},
			{-1,1},
			{1,-1},
			{1,1},
	};
	static Queue<Integer[]> q = new LinkedList<Integer[]>();
	static int r1,c1;
	static int r2,c2;
	static int r3,c3;
	static int[][] a;
	static Integer[] now;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while(!(s=sc.nextLine()).equals("")) {
			Integer[] condition = new Integer[3];
			q.clear();
			a = new int[9][9];
			String[] ss = s.split(" ");
			r1 = Integer.parseInt(ss[0]);
			c1 = Integer.parseInt(ss[1]);
			r2 = Integer.parseInt(ss[2]);
			c2 = Integer.parseInt(ss[3]);
			r3 = Integer.parseInt(ss[4]);
			c3 = Integer.parseInt(ss[5]);
			a[r1][c1] = 1;
			a[r3][c3] = 1;
			condition[0] = 1;
			condition[1] = 1;
			condition[2] = 0;
			q.offer(condition);
			while(!q.isEmpty()) {
				now = q.poll();
				if(now[0]==r2&&now[1]==c2) {
					System.out.println("Case "+(time++)+":"+now[2]);
					break;
				}
				
				int newi=0;
				int newj=0;
				for(int i=0;i<8;i++) {
					newi = now[0]+dir[i][0];
					newj = now[1]+dir[i][1];
					if(newi<1||newi>8||newj<1||newj>8||newi==r3&&newj==c3||a[newi][newj]==1) {
						continue;
					}
					condition = new Integer[3];
					condition[0] = newi;
					condition[1] = newj;
					condition[2] = now[2]+1;
					a[newi][newj] = 1;
					q.offer(condition);
				}
			}
		}
	}

}
