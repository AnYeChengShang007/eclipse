package com.fjx.algorithm.graph;

public class Topu {
	
	static final int n = 4;
	static String[] v = {"a","b","c","d"};
	static int[][] graph = {
			{0,1,0,0},
			{0,0,0,0},
			{0,1,0,0},
			{0,0,1,0}
	};
	//0 未访问 1 已经访问 -1 正在访问未退出递归
	static int[] visit = new int[n];
	static int[] topu = new int[n];
	static int t = n-1;
	
	public static void main(String[] args) {
		for(int i=0;i<n;i++) {
			if(visit[i]==1) continue;
			boolean b = dfs(i);
			if(!b) {
				System.out.println(false);
				return;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(v[topu[i]]+" ");
		}
	}
	
	static boolean dfs(int index) {
		visit[index] = -1;
		
		for(int i=0;i<n;i++) {
			if(graph[index][i]>0) {
				if(visit[i]<0) return false;
				if(visit[i]==0 && !dfs(i)) return false;
			}
		}
		topu[t--] = index;
		visit[index] = 1;
		return true;
	}

}
