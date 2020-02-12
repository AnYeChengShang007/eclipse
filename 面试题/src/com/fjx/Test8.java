package com.fjx;

public class Test8 {
	
	public static void main(String[] args) {
		int out = reverse(1534236469);
		System.out.println(out);
	}
	
	public static int reverse(int x) {
		
		int flag = 1;
		int answer = 0;
		if(x<0) {
			flag = -1;
		}
		x = Math.abs(x);
		int t;
		while(x!=0) {
			t = x%10;
			if(answer-(Integer.MAX_VALUE-t)*1.0/10>1e-5) return 0;
			answer=(10*answer+t);
			x = x/10;
		}
		return answer*flag;
    }

}
