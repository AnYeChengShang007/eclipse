package com.fjx.lanqiaobei2016;

import java.util.Arrays;

public class Main7 {
	
	static int[] a = new int[13];
	static int sum = 0;
	static int[][] youpiao = new int[5][6];
	
	public static void main(String[] args) {
		function(1,5);
		System.out.println(sum);
	}
	
	static boolean dfs(int i,int j) {
		boolean b = false;
		if(i>=1 && i<=3 && j>=1 && j<=4 && youpiao[i][j]==1) {
			youpiao[i][j] = 0;
			b = true;
			dfs(i,j+1);
			dfs(i,j-1);
			dfs(i+1,j);
			dfs(i-1,j);
		}
		return b;
	}
	
	
	
	public static void function(int index,int num) {
		
//		因为再num<=0的时候要进行处理相关数据，防止上一级在调用index=13而且num正好为0的情况被index>12拦截
//		所以要先进行num<=0的判断
		if(num<=0) {
			for(int m=1;m<=3;m++) {
				System.out.println(Arrays.toString(a));
			}
			
			int p = 1;
			for(int m=1;m<=3;m++) {
				for(int n=1; n<=4;n++) {
					youpiao[m][n] = a[p++];
				}
			}
			int v = 0;
			for(int m=1;m<=3;m++) {
				for(int n=1;n<=4;n++) {
					if(dfs(m,n)==true) {
						v++;
						if(v>=2) {
							return;
						}
					}
				}
			}
			sum++;
			return;
		}
		if(index>12) {
			return;
		}
		a[index]=1;
		function(index+1,num-1);
		a[index] = 0;
		function(index+1,num);
	}
	
	
	
	
}
