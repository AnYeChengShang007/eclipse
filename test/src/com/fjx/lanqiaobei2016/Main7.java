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
		
//		��Ϊ��num<=0��ʱ��Ҫ���д���������ݣ���ֹ��һ���ڵ���index=13����num����Ϊ0�������index>12����
//		����Ҫ�Ƚ���num<=0���ж�
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
