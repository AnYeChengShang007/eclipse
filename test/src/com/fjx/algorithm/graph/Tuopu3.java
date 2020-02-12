package com.fjx.algorithm.graph;

public class Tuopu3 {
	
	static final int n = 4;
	static int t = n-1;
	static String[] ss = {"a","b","c","d"};
	static int[][] graph = {
			{0,1,0,0},
			{0,0,0,0},
			{0,1,0,0},
			{0,0,1,0}
	};
	static int[] visit = new int[n];
	static int[] v = new int[n];
	public static void main(String[] args) {
		
		
		for(int i=0;i<n;i++) {
			if(visit[i]==1) continue;
			if(!dfs(i)) {
				System.out.println(false);
				return;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ss[v[i]]+" ");
		}
	}
	
	static boolean dfs(int i) {
		visit[i] = -1;
		for(int j=0;j<n;j++) {
			if(graph[i][j]==1) {
				if(visit[j]==-1) return false;
				if(visit[j]==0) {
					if(!dfs(j)) return false;
				}
			}
		}
		visit[i] = 1;
		v[t--] = i;
		return true;
	}
}
