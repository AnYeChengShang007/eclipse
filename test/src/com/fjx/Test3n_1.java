package com.fjx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3n_1 {
	
	public static void main(String[] args) {
		Map<Integer,Long> map  = new HashMap<Integer,Long>();
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();
		int a6 = sc.nextInt();
		int a7 = sc.nextInt();
		int a8 = sc.nextInt();
		long max = countMax(a1, a2, map);
		System.out.println(a1+" "+a2+" "+max);
		max = countMax(a3, a4, map);
		System.out.println(a3+" "+a4+" "+max);
		max = countMax(a5, a6, map);
		System.out.println(a5+" "+a6+" "+max);
		max = countMax(a7, a8, map);
		System.out.println(a7+" "+a8+" "+max);
		
	}
	
	public static long countMax(int x,int y,Map<Integer,Long> map) {
		long max = 0;
		for(int i=x;i<=y;i++) {
			long n = 0;
			n = countXunHuanJie(i,map);
			map.put(i, n);
			if(max<n) {
				max = n;
			}
		}
		return max;
	}
	
	static int f(long k) {
	    int count = 1;
	    while (k != 1) {
	      if ((k & 1) == 0) {
	        k /= 2;
	      } else {
	        k = k * 3 + 1;
	      }
	      count++;
	    }
	    return count;
	  }
	
	public static long countXunHuanJie(int n,Map<Integer,Long> map) {
		long s = n;
		long num = 0;
		if(map.get(n)!=null) {
			return map.get(n);
		}else {
			while(s!=1) {
				if(s%2!=0) {
					s=s*3+1;
				}else {
					s=s/2;
				}
				num++;
			}
			return num+1;
		}
	}

}
