package com.fjx.lanqiaobei2016;

import java.util.Arrays;
import java.util.Scanner;

public class Main9_2 {
	
	public static int[] ways = new int[3];
	public static int[] nums = new int[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			ways[i] = sc.nextInt();
		}
		Arrays.sort(ways);
		for(int i=0;i<5;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.print(f(nums[i],0,0)+" ");
		}
		System.out.println();
	}
	
	public static char f(int remainder,int my, int you) {
		
		char s = '-';
		if(remainder<ways[0]) {
			if(my%2!=0 && you%2==0) {
				return '+';
			}
			if(my%2!=0 && you%2!=0 || my%2==0 && you%2==0) {
				return '0';
			}
		}
		
		for(int i=0;i<3 && ways[i]<=remainder;i++) {
			char c = f(remainder-ways[i],you,my+ways[i]);
			if(c=='-') {
				s = '+';
				break;
			}else if(c=='0') {
				s = '0';
			}
		}
		
		return s;
	}

}
