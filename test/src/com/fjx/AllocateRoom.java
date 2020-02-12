package com.fjx;

import java.util.Scanner;

public class AllocateRoom {
	
	static int[] room;
	static int[][] relation;
	static int n;
	static int[] cnt;
	static int[][] f;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		relation = new int[n+1][n+1];
		room = new int[n+1];
		cnt = new int[n+1];
		f = new int[n+1][n+1];
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			relation[a][b] = relation[b][a] = 1;
		}
		DFS(1,0);
	}
	
	static void DFS(int x,int total) {
		
		if(x==n+1) {
			System.out.println(total);
			System.exit(0);
			return;
		}
		
		for(int i=1;i<=total;i++) {//挨个儿搜索每个房间
			int j=1;//从第一个人开始搜索
			for(;j<=cnt[i];j++) {
				if(relation[x][f[i][j]]==1) {
					break;
				}
			}
			if(j==cnt[i]+1) {
				cnt[i]++;
				f[i][j] = x;
				DFS(x+1,total);
				cnt[i]--;
				f[i][j] = 0;
			}
		}
		cnt[total+1]++;
		f[total+1][1] = x;
		DFS(x+1,total+1);
		cnt[total+1]--;
		f[total+1][1] = 0;
	}

}
