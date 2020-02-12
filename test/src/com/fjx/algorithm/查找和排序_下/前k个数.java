package com.fjx.algorithm.查找和排序_下;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 求海量数据（正整数）按逆序排列的前k个数，因为数据
 * 量太大，不能全部存储在内存中，只能一个一个地从磁盘或者网络
 * 上读取数据，请设计一个高效的算法来解决这个问题。
 * 不限制用户输入数据个数，用户每输入一个数据就回车使得程序可以立即获得
 * 这个数据，用户输入-1代表终止输入
 * 然后用户输入k，代表要求得topK
 * 请输入topK，从小到大，空格分割
 */
public class 前k个数 {
	
	private static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = -1;
		while(-1!=(data = sc.nextInt())) {
			list.add(data);
		}
		int k = sc.nextInt();
		printTopK();
	}
	
	public static void printTopK() {
		
	}
	
}
