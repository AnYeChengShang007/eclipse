package com.fjx;

import java.util.Scanner;

public class Monkey_banana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ӣ��㽶�����ӵ�λ��");
		int num = 1;
		int monkey = sc.nextInt();
		int banana = sc.nextInt();
		int bench = sc.nextInt();
		if(bench-monkey!=0) {
			int step = (bench-monkey)/Math.abs(bench-monkey);
			while(monkey!=bench) {
				monkey+=step;
				System.out.println("step"+(num++)+":"+"���ӿ����ߵ���λ��:"+monkey);
			}
		}
		System.out.println("step"+(num++)+":"+"��������������");
		if(banana-monkey!=0) {
			int step = (banana-monkey)/Math.abs(banana-monkey);
			while(monkey!=banana) {
				monkey+=step;
				System.out.println("step"+(num++)+":"+"�������������ߵ���λ��"+monkey);
			}
		}
		System.out.println("step"+(num++)+":"+"���ӷ�������ȡ�����㽶");
	}
}
