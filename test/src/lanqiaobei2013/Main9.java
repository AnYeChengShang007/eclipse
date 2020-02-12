package lanqiaobei2013;

import java.util.Scanner;

public class Main9 {
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int sum;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		f(0,num);
		System.out.println(sum);
	}
	public static void f(int k,int num) {
			
			if(k>8) {
				for(int m=0;m<9;m++) {
					for(int j=8;j>=0;j--) {
						int c = 0;
						for(int o=0;o<=8-j;o++) {
							c=c*10+a[j+o];
						}
						int x = 0;
						for(int o=1;o<j-m;o++) {
							x=x*10+a[m+o];
						}
						if(x%c==0) {
							int z = 0;
							for(int o=0;o<=m;o++) {
								z=z*10+a[o];
							}
							if(num==z+x/c) {
								sum++;
							}
						}
					}
				}
				return;
			}
			
		for(int i=k;i<a.length;i++) {
			int t = a[i];
			a[i]=a[k];
			a[k]=t;
			f(k+1,num);
			t=a[i];
			a[i]=a[k];
			a[k]=t;
		}
	}
	
}
