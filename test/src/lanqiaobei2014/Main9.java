package lanqiaobei2014;

import java.util.Scanner;

public class Main9 {
	public static int[][] a;
	public static int k;
	public static int n;
	public static int m;
	public static long[][][][] buf;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n  = sc.nextInt();	
		m = sc.nextInt();	
		k = sc.nextInt();	
		a = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		buf = new long[n+1][m+1][k+1][14];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				for(int p=0;p<=k;p++) {
					for(int q=0;q<=13;q++) {
						buf[i][j][p][q] = -1l;
					}
				}
			}
		}
		System.out.println(function(0,0,0,-1));
	}
	
	public static long function(int x,int y,int num,int max) {
		if(x>=n || y>=m || num>k) {
			return 0;
		}
		if(buf[x][y][num][max+1]!=-1) {
			return buf[x][y][num][max+1];
		}
		long ans = 0;
		if(x==n-1 && y==m-1) {
			if(num==k)ans++;
			if(num==k-1 && a[x][y]>max) {
				ans++;
			}
			if(ans>1000000007)
				ans%=1000000007;
			return ans;
		}
		
		if(a[x][y]>max) {
			ans+=function(x+1,y,num+1,a[x][y]);
			ans+=function(x,y+1,num+1,a[x][y]);
		}
		ans+=function(x+1,y,num,max);
		ans+=function(x,y+1,num,max);
		buf[x][y][num][max+1] = ans;
		return ans;
	}
	
	
}
