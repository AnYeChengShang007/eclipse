package lanqiaobei2015;

import java.util.Scanner;

public class Main9 {
	
	static int[] op = new int[7];
	static boolean[][] conflict = new boolean[7][7];
	static int MOOD = (int) 10e9+7;
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
		long ans = 0;
		for(int i=1;i<=6;i++) {
			ans = (ans+f(n-1,i))%MOOD;
		}
		System.out.println((ans*4)%MOOD);
	}

	private static long f(int n, int history_up) {
		long ans = 0;
		if(n==0) {
			return 1;
		}
		for(int i=1;i<=6;i++) {
			if(conflict[op[history_up]][i])continue;
			ans = (ans+f(n-1,i))%MOOD;
		}
		
		return (4*ans)%MOOD;
	}
	
}
