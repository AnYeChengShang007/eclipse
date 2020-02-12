package com.fjx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CutGrid {
	
	static int[][] visit;
	static int[][] nums;
	static int sum;
	static int m;
	static int n;
	static Queue<Condition> q = new LinkedList<Condition>();
	static int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		visit = new int[n][m];
		nums = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				nums[i][j] = sc.nextInt();
				sum+=nums[i][j];
			}
		}
		Condition con = new Condition(0,0,nums[0][0],1);
		q.offer(con);
		visit[0][0] = 1;
		sum/=2;
		BFS(q);
	}

	static void BFS(Queue<Condition> q) {
		while(!q.isEmpty()) {
			Condition now = q.poll();
			
			if(now.sum==sum) {
				System.out.println(now.num);
				return;
			}
			
			for(int i=0;i<4;i++) {
				int newx = now.x+dir[i][0];
				int newy = now.y+dir[i][1];
				if(newx<0||newx>n-1||newy<0||newy>m-1) {
					continue;
				}
				if(visit[newx][newy]==1) {
					continue;
				}
				Condition con = new Condition(newx, newy, nums[newx][newy]+now.sum,now.num+1);
				visit[newx][newy] = 1;
				q.offer(con);
			}
		}
		System.out.println(0);
	}
	
	static class Condition{
		int x;
		int y;
		int sum;
		int num;
		public Condition(int x, int y, int sum,int num) {
			this.x = x;
			this.y = y;
			this.sum = sum;
			this.num = num;
		}
	}
	
}
