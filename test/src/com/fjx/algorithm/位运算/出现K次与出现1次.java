package com.fjx.algorithm.位运算;

public class 出现K次与出现1次 {
	/*
	 * 数组中只有一个数字出现了1次，其他的数都出现了K次，请求出现了1次的数
	 * 
	 * 有一个规律：
	 * k个相同的k进制数做不进位加法结果为0
	 */
	public static void main(String[] args) {
		int[] a = {3,3,3,5,5,5,50,8,8,8,9,9,9};
		int k = 3;
		char[][] cs = new char[a.length][];
		int maxlen = 0;
		for(int i=0;i<a.length;i++) {
			cs[i] = new StringBuilder(Integer.toString(a[i], k)).
					reverse().toString().toCharArray();
			if(cs[i].length>maxlen) {
				maxlen = cs[i].length;
			}
//			System.out.println(new String(cs[i]));
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<maxlen;i++) {
			int sum = 0;
			for(int j=0;j<a.length;j++) {
				if(i<cs[j].length) {
					int b = Integer.parseInt(cs[j][i]+"", k);
					sum+=b;
					sum%=k;
				}
			}
			sb.append(Integer.toString(sum).toString());
		}
		System.out.println(Integer.parseInt(sb.reverse().toString(), k));
	}
}
