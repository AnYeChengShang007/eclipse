package com.fjx.lanqiaobei2018;

import java.util.Scanner;

public class Main4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = dp(3, n);
		System.out.println(s);
	} // x手机数，y楼层

	private static int dp(int x, int y) {
		int time = 1; // 测试次数
		while (max(x, time) < y) {
			time++;
		}
		return time;
	}

	private static int max(int x, int time) {
		if (x == 1) {
			return time;
		}
		if (x >= time) {
			return (int) (Math.pow(2, time) - 1);
		}
		return max(x, time - 1) + max(x - 1, time - 1) + 1;
	}

}
