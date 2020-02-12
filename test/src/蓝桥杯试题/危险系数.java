package ¿∂«≈±≠ ‘Ã‚;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Œ£œ’œµ ˝ {
	
	static int[][] graph;
	static int res;
	static int start;
	static int end;
	static int n;
	static int m;
	static int num;
	static boolean[] vis;
	static int[] time;
	static boolean ok;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		vis = new boolean[n+1];
		time = new int[n+1];
		graph = new int[n+1][n+1];
		for(int i=1;i<n;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph[u][v] = 1;
			graph[v][u] = 1;
		}
		start = sc.nextInt();
		end = sc.nextInt();
		dfs(start);
		for(int i=1;i<=n;i++) {
			if(time[i]==num)
				res++;
		}
		System.out.println(res);
	}

	public static void dfs(int i) {
		
		if(i==end) {
			num++;
		}
		
		for(int j=1;j<=n;j++) {
			if(!vis[j] && j!=start && graph[i][j]==1) {
				vis[j] = true;
				if(j!=end)
					time[j]++;
				dfs(j);
				vis[j] = false;
			}
		}
	}

}
