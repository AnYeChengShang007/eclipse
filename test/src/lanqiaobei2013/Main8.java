package lanqiaobei2013;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n/2+1];
		for(int i=0;i<n/2+1;i++) {
			a[i] = i*2+1;
		}
		int ans = 0;
		int l = 1;
		int p;
		while(true) {
			p = l;
			for(int i=l+1;i<=n/2+1;i++) {
				if(i%a[l]==0) {
					
				}else {
					a[p++] = a[i-1];
				}
				if(a[i-1]>=n) break;
			}
			l++;
			if(a[l]>=n) {
				break;
			}
		}
		for(int j=1;j<p;j++) {
			if(a[j-1]>m && a[j-1]<n)ans++;
		}
		
		System.out.println(ans);
		
	}
		
}
