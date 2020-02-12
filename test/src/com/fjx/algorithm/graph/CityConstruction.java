package com.fjx.algorithm.graph;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CityConstruction {
	
	static int[][] paragraph;
	static int[] root;
	static int[] dock;
	static int[] h;
	static int spend;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Edge> list = new LinkedList<Edge>();
		Set<Edge> set = new HashSet<Edge>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		paragraph = new int[n+1][n+1];
		root = new int[n+1];
		dock = new int[n+1];
		h = new int[n+1];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.add(new Edge(a,b,c));
			paragraph[a][b] = c;
			paragraph[b][a] = c;
		}
		for(int i=1;i<=n;i++) {
			dock[i] = sc.nextInt();
		}
		Collections.sort(list);
		for(Edge e:list) {
			if(getRoot(e.start)==getRoot(e.end))continue;
			int w1 = e.weight;//造路的消费
			if(dock[e.start]==-1||dock[e.end]==-1) {
				spend+=w1;
			}else {
				int w2 = dock[e.start]+dock[e.end];//造码头的花费
				if(w1<=w2) {
					spend+=w1;
				}else {
					spend+=w2;
				}
			}
			union(e.start, e.end);
			set.add(e);
			if(set.size()==n-1) {
				break;
			}
		}
		System.out.println(spend);
		
	}
	
	static int getRoot(int index) {
		int r = index;
		Set<Integer> s = new HashSet<Integer>();
		while(root[r]!=0) {
			s.add(r);
			r = root[r];
		}
		for(int c:s) {
			root[c] = r;
		}
		return r;
	}
	
	static void union(int index1,int index2) {
		int r1 = getRoot(index1);
		int r2 = getRoot(index2);
		if(r1!=r2) {
			int h1 = h[r1];
			int h2 = h[r2];
			if(h1<h2) {
				root[r1] = r2;
			}else if(h1>h2){
				root[r2] = r1;
			}else {
				root[r2] = r1;
				h[r1]++;
			}
		}
	}

	static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int weight;
		
		public Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			if(o.weight==this.weight)
				return 0;
			return this.weight<o.weight?-1:1;
		}
	}
}
