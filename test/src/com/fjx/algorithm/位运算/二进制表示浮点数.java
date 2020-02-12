package com.fjx.algorithm.位运算;

public class 二进制表示浮点数 {
	/*
	 * 若小数点后面超过32位，则输出ERROR；
	 */
	public static void main(String[] args) {
		double n = 0.625;
		StringBuilder sb = new StringBuilder("0.");
		while(n>0) {
			n*=2;
			if(n>=1) {
				sb.append("1");
				n-=1;
			}else {
				sb.append("0");
			}
			if(sb.length()>34) {
				System.out.println("ERROR");
				return;
			}
		}
		System.out.println(sb);
	}

}
