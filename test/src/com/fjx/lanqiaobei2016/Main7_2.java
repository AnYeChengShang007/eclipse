package com.fjx.lanqiaobei2016;

import java.util.Arrays;

public class Main7_2 {
	static int[] a = {0,0,0,0,0,0,0,1,1,1,1,1};
	static boolean[] visit = new boolean[12];
	static int ans;
	
	
	public static void main(String[] args) {
		f(0,new int[12]);
		System.out.println(ans);
		
	}
	
	
	
	static void f(int k,int[] path) {
		
		if(k==12) {
			if(check(path)) {
				ans++;
//				System.out.println(Arrays.toString(path));
			}
			return;
		}
		
		for(int i=0;i<12;i++) {
			if(i>0 && a[i-1]==a[i] && !visit[i-1]) 
				continue;
			if(!visit[i]) {
				visit[i] = true;
				path[k] = a[i];
				f(k+1,path);
				visit[i] = false;
			}
		}
		
	}
	
	static boolean check(int[] path) {
		int[][] pic = new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				pic[i][j] = path[i*4+j];
			}
		}
		
		int count = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(pic[i][j]==1) {
					count++;
					dfs(pic,i,j);
				}
			}
		}
		return count==1;
	}
	
	static void dfs(int[][] pic,int i,int j) {
		pic[i][j] = 0;
		if(i+1<3 && pic[i+1][j]==1) {
			dfs(pic,i+1,j);
		}
		if(i-1>=0 && pic[i-1][j]==1) {
			dfs(pic,i-1,j);
		}
		if(j+1<4 && pic[i][j+1]==1) {
			dfs(pic,i,j+1);
		}
		if(j-1>=0 && pic[i][j-1]==1) {
			dfs(pic,i,j-1);
		}
	}

}
