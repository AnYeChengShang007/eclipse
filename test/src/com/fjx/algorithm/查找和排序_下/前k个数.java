package com.fjx.algorithm.���Һ�����_��;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * �������ݣ������������������е�ǰk��������Ϊ����
 * ��̫�󣬲���ȫ���洢���ڴ��У�ֻ��һ��һ���شӴ��̻�������
 * �϶�ȡ���ݣ������һ����Ч���㷨�����������⡣
 * �������û��������ݸ������û�ÿ����һ�����ݾͻس�ʹ�ó�������������
 * ������ݣ��û�����-1������ֹ����
 * Ȼ���û�����k������Ҫ���topK
 * ������topK����С���󣬿ո�ָ�
 */
public class ǰk���� {
	
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
