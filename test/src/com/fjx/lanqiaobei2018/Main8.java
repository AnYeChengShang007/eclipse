package com.fjx.lanqiaobei2018;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int K = sc.nextInt();
		int[][] a = new int[N][2];
		
		for(int i=0; i<N; i++) {
			int ts = sc.nextInt();
			int id = sc.nextInt();
			a[i][0] = ts;
			a[i][1] = id;
		}
		function(N, D, K, a);
	}
	public static void function(int N,int D,int K,int[][] a) {
		List<Integer> answer = new LinkedList<Integer>();
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<a.length;i++) {
			if(map.get(a[i][1])!=null) {
				map.get(a[i][1]).add(a[i][0]);
			}else {
				LinkedList<Integer> list = new LinkedList<Integer>();
				list.add(a[i][0]);
				map.put(a[i][1], list);
			}
		}
		for(int k:map.keySet()) {
			List<Integer> list = map.get(k);
			Collections.sort(list);
			int num=1;
			Integer qian = list.get(0);
			if(	D==1) {
				answer.add(k);
				continue;
			}
			for(int i=1;i<list.size();i++) {
				int hou = list.get(i);
				if(hou-qian+1<=D) {
					num++;
				}else {
					num=1;
				}
				if(num==K) {
					answer.add(k);
					break;
				}
				qian = hou;
			}
		}
		
		Collections.sort(answer);
		for(int ans:answer) {
			System.out.println(ans);
		}
		
	}

}
