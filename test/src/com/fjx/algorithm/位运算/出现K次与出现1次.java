package com.fjx.algorithm.λ����;

public class ����K�������1�� {
	/*
	 * ������ֻ��һ�����ֳ�����1�Σ�����������������K�Σ����������1�ε���
	 * 
	 * ��һ�����ɣ�
	 * k����ͬ��k������������λ�ӷ����Ϊ0
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
