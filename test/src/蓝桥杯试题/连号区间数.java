package 蓝桥杯试题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 连号区间数 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(
				new InputStreamReader(System.in)
				);
		int res = 0;
		int n = Integer.parseInt(sc.readLine());
		int[] arr = new int[n];
		String[] split = sc.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		for(int l=0;l<n;l++) {
			for(int r=0;r<n;r++) {
				int max = arr[l];
				int min = arr[l];
				for(int i=l+1;i<=r;i++) {
					if(max<arr[i])
						max = arr[i];
					if(min>arr[i])
						min = arr[i];
				}
				if(max-min==r-l) {
					res++;
				}
				
			}
		}
		System.out.println(res);
	}

}
