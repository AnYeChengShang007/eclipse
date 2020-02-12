package com.fjx;

import java.util.Scanner;

public class CutGrid2 {
	static boolean ok;
	static int[][] visit;
	static int[][] nums;
	static int sum;
	static int m;
	static int n;
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
		sum/=2;
		visit[0][0] = 1;
		DFS(0,0,1,nums[0][0]);
	}

	static void DFS(int old_x, int old_y, int num, int oo) {
		
		if(oo==sum) {
			System.out.println(num);
			ok = true;
			return;
		}
		
		for(int i=0;i<4;i++) {
			int newx = old_x+dir[i][0];
			int newy = old_y+dir[i][1];
			if(newx<0||newx>n-1||newy<0||newy>m-1) continue;
			if(visit[newx][newy]!=1) {
				if(!ok) {
					visit[newx][newy] = 1;
					DFS(newx,newy,num+1,oo+nums[newx][newy]);
					visit[newx][newy] = 0;
				}
			}
		}
	}

	
}
