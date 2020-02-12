package com.fjx;


import java.math.BigDecimal;
import java.util.Scanner;


public class FloatNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a, b);
		a/=gcd;
		b/=gcd;
		int n = sc.nextInt();
		BigDecimal n1 = new BigDecimal(a+"");
		BigDecimal n2 = new BigDecimal(b+"");
		BigDecimal divide = n1.divide(n2,n+2,BigDecimal.ROUND_DOWN);
		String string = divide.toPlainString();
		String[] ss = string.split("\\.");
		if(n>ss[1].length()) {
			System.out.println(000+"");
		}else if(n>ss[1].length()-1) {
			System.out.println(ss[1].charAt(n-1)+""+00);
		}else if(n>ss[1].length()-2) {
			System.out.println(ss[1].charAt(n-1)+""+ss[1].charAt(n-2)+""+0);
		}else {
			System.out.println(ss[1].substring(n-1,n+2));
		}
	}
	
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		
		return gcd(b,a%b);
	}

}
