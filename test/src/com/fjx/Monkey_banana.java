package com.fjx;

import java.util.Scanner;

public class Monkey_banana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请你输入猴子，香蕉和椅子的位置");
		int num = 1;
		int monkey = sc.nextInt();
		int banana = sc.nextInt();
		int bench = sc.nextInt();
		if(bench-monkey!=0) {
			int step = (bench-monkey)/Math.abs(bench-monkey);
			while(monkey!=bench) {
				monkey+=step;
				System.out.println("step"+(num++)+":"+"猴子空手走到了位置:"+monkey);
			}
		}
		System.out.println("step"+(num++)+":"+"猴子拿起了椅子");
		if(banana-monkey!=0) {
			int step = (banana-monkey)/Math.abs(banana-monkey);
			while(monkey!=banana) {
				monkey+=step;
				System.out.println("step"+(num++)+":"+"猴子拿着椅子走到了位置"+monkey);
			}
		}
		System.out.println("step"+(num++)+":"+"猴子放下椅子取得了香蕉");
	}
}
