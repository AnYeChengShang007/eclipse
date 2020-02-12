package com.fjx.cg;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		if(n==1) {
			System.out.println(compress(s));
		}else {
			System.out.println(deCompress(s));
		}
		
	}
	
	static String deCompress(String reduceString) {
		StringBuilder sb = new StringBuilder();
		char[] cs = reduceString.trim().toCharArray();
		int i=0;
		for(;i+1<cs.length;) {
			if(!isNumber(cs[i+1])) {
				sb.append(cs[i]);
				if(i+1==cs.length-1) {
					sb.append(cs[i+1]);
				}
				i++;
			}else {
				int t =theNumOfNumber(cs, i+1);
				int num = theNumberOfChar(cs, i+1, t);
				for(int p=0;p<num;p++) {
					sb.append(cs[i]);
				}
				i+=(t+1);
			}
		}
		if(i==cs.length-1 && !isNumber(cs[i]) && isNumber(cs[i-1])) {
			sb.append(cs[i]);
		}
		return sb.toString();
	}
	
	static boolean isNumber(char c) {
		if(c>='0' && c<='9')
			return true;
		return false;
	}
	
	static int theNumOfNumber(char[] cs,int index) {
		int num = 0;
		for(int i=index;i<cs.length;i++) {
			if(isNumber(cs[i]))
				num++;
			else 
				break;
		}
		return num;
	}
	
	static int theNumberOfChar(char[] cs,int off,int length) {
		String s = new String(cs,off,length);
		Integer num = Integer.parseInt(s);
		return num;
	}
	
	static String compress(String originString) {
		StringBuilder sb = new StringBuilder();
		char[] cs = originString.toCharArray();
		int num = 1;
		for(int i=1;i<cs.length;i++) {
			if(cs[i]==cs[i-1]) {
				num++;
			}else {
				sb.append(cs[i-1]);
				if(num>=2) {
					sb.append(num+"");
					num=1;
				}
			}
		}
		if(num==1) {
			sb.append(cs[cs.length-1]);
		}else {
			sb.append(cs[cs.length-1]+""+num);
		}
		return sb.toString();
	}
}
