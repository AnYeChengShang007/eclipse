package com.fjx;

public class Test9 {
	
	public static void main(String[] args) {
		int out = myAtoi("  + -2");
		System.out.println(out);
	}

	
	public static int myAtoi(String str) {
		int flag = 1;
		int index = -1;
		boolean yes = true;
		for(int i=0; i<str.length(); i++) {
			if(isNum(str,i)) {
				index = i;
				break;
			}else {
				if(str.charAt(i)!=' ' && str.charAt(i)!='-' && str.charAt(i)!='+' ) {
					yes = false;
				}
				if(i+1<str.length() && (str.charAt(i)=='-' || str.charAt(i)=='+' ) && !isNum(str, i+1))
					yes = false;
			}
		}
		
		int num = 0;
		int t = 0;
		
		
		
		if(( index!=-1) && yes) {
			if(index-1>=0 && str.charAt(index-1)=='-') {
				flag = -1;
			}
			while(index<str.length() && isNum(str, index)) {
				t = str.charAt(index)-'0';
				if(num-(Integer.MAX_VALUE-t)*1.0/10>0 && flag==1) {
					return Integer.MAX_VALUE;
				}else if(num-((Integer.MAX_VALUE-t)*1.0)/10-0.1>1e-5 && flag==-1) {
					return Integer.MIN_VALUE;
				}
				num = num*10+t;
				index++;
			}
		}
		return num*flag;
    }
	
	
	public static boolean isNum(String s,int index) {
		int f = s.charAt(index)-'0';
		if(f>=0 && f<=9) {
			return true;
		}
		return false;
	}
}
