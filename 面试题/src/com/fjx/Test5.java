package com.fjx;

public class Test5 {
	
	public static void main(String[] args) {
		maxHuiwen("babad");
	}
	
	public static void maxHuiwen(String s) {
		
		int max_len = 0;
		int begin=0,end=0;
		for(int i=0; i<s.length(); i++) {
			for(int j=s.length()-1; j>=0;j--) {
				if(i<j) {
					if(isHuiwen(s,i,j) && j-i+1>max_len) {
						max_len = j-i+1;
						begin = i;
						end = j;
					}
				}else {
					break;
				}
			}
		}
		if(max_len == 0)
			System.out.println("ÎÞ»ØÎÄ´®");
		else
			System.out.println( s.substring(begin,end+1));
		
	}
	
	public static boolean isHuiwen(String s,int begin,int end) {
		
		while(begin<end) {
			if(!(s.charAt(begin++)==s.charAt(end--)))
				return false;
		}
		return true;
	}

}
