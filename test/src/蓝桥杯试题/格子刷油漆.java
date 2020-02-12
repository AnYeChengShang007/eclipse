package ¿∂«≈±≠ ‘Ã‚;

import java.util.Scanner;

public class ∏Ò◊”À¢”Õ∆· {
	
	static int res;
	static int[][] squeares;
	static int[][] dir = {
			{-1,-1},
			{1,1},
			{-1,1},
			{1,-1},
			{0,1},
			{0,-1},
			{1,0},
			{-1,0},
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		squeares = new int[2][n];
		for(int i=0;i<n;i++) {
			squeares[0][i] = 1;
			dfs(0,i,n*2-1);
			squeares[0][i] = 0;
		}
		res = res*2%1000000007;
		System.out.println(res);
	}
	
	public static void dfs(int x,int y,int num) {
		
		if(num==0) {
			res++;
			res%=1000000007;
			return;
		}
		
		 for(int i=0;i<8;i++) {
			 int x1 = x+dir[i][0];
			 int y1 = y+dir[i][1];
			 if(x1>=0&&x1<=1&&y1>=0&&y1<squeares[0].length&&squeares[x1][y1]==0) {
				 squeares[x1][y1] = 1;
				 dfs(x1,y1,num-1);
				 squeares[x1][y1] = 0;
			 }
		 }
	}

}
