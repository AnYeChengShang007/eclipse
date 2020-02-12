package lanqiaobei2015;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Main9_2 {
	
	static int[] op = new int[7];
	static boolean[][] conflict = new boolean[7][7];
	static int MOOD = (int) 10e9+7;
	static long[][] ans = new long[2][7];
	static {
		op[1] = 4;
		op[2] = 5;
		op[3] = 6;
		op[4] = 1;
		op[5] = 2;
		op[6] = 3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=1;i<=m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			conflict[a][b] = true;
			conflict[b][a] = true;
		}
		
		int cur = 0;
		for(int i=1;i<=6;i++) {
			ans[0][i] = 1;
		}
		
		for(int i=1;i<n;i++) {
			cur = 1-cur;
			for(int j=1;j<=6;j++) {
				ans[cur][j] = 0;
				for(int p=1;p<=6;p++) {
					if(conflict[p][op[j]])continue;
					ans[cur][j] = (ans[cur][j]+ans[1-cur][p])%MOOD;
				}
			}
		}
		
		long answer = 0;
		for(int i=1;i<=6;i++) {
			answer =(answer+ans[cur][i])%MOOD;
		}
		
		answer = (answer*pow(4,n))%MOOD;
		System.out.println(answer);
	}
	
	public static long pow(int num,int n) {
		long sum = num;
		while(n>1) {
			sum=sum<<2;
			sum%=MOOD;
			n--;
		}
		
		return sum;
	}
	
	@Test
	public void test01() throws Exception {
		System.out.println(pow(4,3));
	}

}
