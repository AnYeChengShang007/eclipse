package com.fjx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindCircle {
	
	static int[] h;
	static int[][] pic;
	static Set<Integer> list = new TreeSet<Integer>();
	static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	static Set<Integer> set = new HashSet<Integer>();
	static int start;
	static int end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		h = new int[n+1];
		pic = new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			a[i] = -1;
		}
		for(int i=1;i<=n;i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			pic[num1][num2] = pic[num2][num1] = 1;
			map.put(num1, num2);
			update(num1, num2, a);
		}
		list.add(start);
		DFS(start);
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static void DFS(int start) {
		
		int next = map.get(start);
		if(!set.contains(next)) {
			list.add(next);
			set.add(next);
			DFS(next);
		}
		
	}
	
	static void update(int num1,int num2,int[] root) {
		int root1 = getRooot(num1, root);
		int root2 = getRooot(num2, root);
		if(root1!=root2) {
			if(h[root1]<h[root2]) {
				root[root1] = root2;
			}else if(h[root1]>h[root2]){
				root[root2] = root1;
			}else {
				root[root2] = root1;
				h[root1]++;
			}
		}else {
			start = num1;
			end= num2;
		}
	}
	
	static int getRooot(int num,int[] root) {
		if(root[num]==-1)
			return num;
		else
			return getRooot(root[num], root);
	}

}
