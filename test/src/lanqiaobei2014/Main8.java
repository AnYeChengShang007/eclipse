package lanqiaobei2014;

import java.util.Scanner;

public class Main8 {
	
	static int[][] a = null;
	
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		a = new int[2][N];
		for(int i=0; i<N; i++) {
			a[0][i] = sc.nextInt();
		}
		
		while(true) {
			if(checkSame(a)) {
				break;
			}
			for(int i=0;i<N;i++) {
				a[1][(i+1)%N] = a[0][i]/2;
				a[0][i] -=a[0][i]/2;
			}
			for(int i=0;i<N;i++) {
				a[0][i]+=a[1][i];
				if((a[0][i]&1)==1) {
					a[0][i]++;
					num++;
				}
			}
			
		}
		System.out.println(num);
	}

	
	static boolean checkSame(int[][] a){
		boolean b = true;
		
		for(int i=1; i<a[0].length; i++) {
			if(a[0][i]!=a[0][i-1]) {
				return false;
			}
		}
		
		return b;
	}
	
}
