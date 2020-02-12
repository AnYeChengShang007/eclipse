package ¿∂«≈±≠ ‘Ã‚;


import java.util.Scanner;


public class ≥–—πº∆À„ {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long[][] a = new long[30][30];
		for(int i=0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j] = (long) (sc.nextInt()*Math.pow(2, 29));
			}
		}
		for(int i=0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i+1][j] += a[i][j]/2;
				a[i+1][j+1] += a[i][j]/2;
			}
		}
		long max = a[29][0];
		for(int i=1;i<30;i++) {
			if(max<a[29][i])
				max = a[29][i];
		}
		System.out.println(max);
	}
	
	
}
