package com.fjx.lanqiaobeiceshi;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			ss[i] = new String(sc.nextLine()).toUpperCase();
		}
		for(int i=0;i<n;i++) {
			System.out.println(hto(ss[i]));
		}
		
		
	}
	
	public static String hto(String hs) {
		String bin = toOctString(toBinaryString(hs));
		return bin;
	}
	
	public static String toOctString(StringBuilder binaryString) {
		StringBuilder string = new StringBuilder();
		for(int i=binaryString.length();i>=3;i-=3) {
			String sub = binaryString.substring(i-3,i);
			if(sub.equals("000")) string.insert(0, "0");
			if(sub.equals("001")) string.insert(0, "1");
			if(sub.equals("010")) string.insert(0, "2");
			if(sub.equals("011")) string.insert(0, "3");
			if(sub.equals("100")) string.insert(0, "4");
			if(sub.equals("101")) string.insert(0, "5");
			if(sub.equals("110")) string.insert(0, "6");
			if(sub.equals("111")) string.insert(0, "7");
		}
		if(binaryString.length()%3!=0) {
			int i = binaryString.length()%3;
			String sub = binaryString.substring(0,i);
			if(sub.equals("0") || sub.equals("00")) string.insert(0, "0");
			if(sub.equals("1")|| sub.equals("01")) string.insert(0, "1");
			if(sub.equals("10")) string.insert(0, "2");
			if(sub.equals("11")) string.insert(0, "3");
		}
		return removePreZore(string.toString());
	}
	
	public static StringBuilder toBinaryString(String hexString) {
		StringBuilder string = new StringBuilder();
		int time = hexString.length();
		for(int i=0;i<time;i++) {
			char c = hexString.charAt(i);
			if(c=='0') string.append("0000");
			if(c=='1') string.append("0001");
			if(c=='2') string.append("0010");
			if(c=='3') string.append("0011");
			if(c=='4') string.append("0100");
			if(c=='5') string.append("0101");
			if(c=='6') string.append("0110");
			if(c=='7') string.append("0111");
			if(c=='8') string.append("1000");
			if(c=='9') string.append("1001");
			if(c=='A') string.append("1010");
			if(c=='B') string.append("1011");
			if(c=='C') string.append("1100");
			if(c=='D') string.append("1101");
			if(c=='E') string.append("1110");
			if(c=='F') string.append("1111");
		}
		return string;
	}
	
	public static String removePreZore(String s) {
		int i=0;
		for(;i<s.length();) {
			if(s.charAt(i)=='0') {
				i++;
			}else {
				break;
			}
		}
		return s.substring(i);
	}
}
