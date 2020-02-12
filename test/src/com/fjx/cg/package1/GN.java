package com.fjx.cg.package1;

import java.util.Arrays;
import java.util.Scanner;

public class GN {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[2*n+n*(n-1)/2+1];
		int x = 0;
		a[0] = 0;
		int i=1;
		for(;i<=n;) {
			x = sc.nextInt();
			if(x==m) {
				System.out.println(m);
				break;
			}else if(x<m) {
				a[i++] = x;
			}
		}
		int k = i-1;
		n = i;
		for(i=1;i<=k;i++) {
			for(int j=i;j<=k;j++) {
				if(a[i]+a[j]==m) {
					System.out.println(m);
					break;
				}else if(a[i]+a[j]<m) {
					a[n++] = a[i]+a[j];
				}
			}
		}
		Arrays.sort(a);
		int max = 0;
		int l = 0;
		int r = n-1;
		for(i=0;i<n;i++) {
			l = i;
			while(l<=r) {
				int mid = (l+r)/2;
				x = a[l]+a[mid];
				if(x<m) {
					l = mid+1;
					if(x>max) {
						max = x;
					}
				}else if(x==m) {
					System.out.println(m);
					return;
				}else {
					r = mid-1;
				}
			}
			System.out.println(max);
		}
	}

}
