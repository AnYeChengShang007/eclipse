package com.fjx.algorithm.查找与排序_上;

/*
 * 小白正在上楼梯，楼梯有n节台阶，小白一次可以
 * 上1,2,3节，实现一个方法，计算小白有多少
 * 种走完楼梯的方式
 */
public class 小白上楼梯 {
	
	public static void main(String[] args) {
		System.out.println(f(3  ));
	}
	
	public static int f(int n) {
		if(n==1)
			return 1;
		if(n==0)
			return 1;
		if(n>=3)
			return (f(n-1)+f(n-2)+f(n-3));
		else if(n>=2)
			return (f(n-1)+f(n-2));
		else
			return f(n-1);
	}
}
