package com.fjx.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Balancing_weight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder reverse = new StringBuilder(Integer.toString(n,3)).reverse();
		List<Integer> list = new ArrayList<Integer>();
		int jinwei = 0;
		for(int i=0;i<reverse.length();i++) {
			int num = jinwei+Integer.parseInt(reverse.charAt(i)+"");
			if(num==2) {
				list.add(-1);
				jinwei = 1;
			}else if(num==3) {
				list.add(0);
				jinwei = 1;
			}else {
				list.add(num);
				jinwei = 0;
			}
			if(i==reverse.length()-1 && num!=0) {
				list.add(jinwei);
			}
		}
		int num = (int) Utils.pow(3, list.size()-1);
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i)+0==1) {
				System.out.print(num);
			}
			if(list.get(i)+0==-1) {
				System.out.print(-num);
			}
			num/=3;
		}
	}

}
