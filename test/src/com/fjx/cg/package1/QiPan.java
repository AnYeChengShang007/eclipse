package com.fjx.cg.package1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QiPan {
	static int[][] a = new int[10][10];
	static int r3;
	static int c3;
	static int r2;
	static int c2;
	static int time = 1;
	static Queue<Node> q = new LinkedList<Node>();
	static int way[][] = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1},
			{-1,-1},
			{-1,1},
			{1,-1},
			{1,1}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while(!(s=sc.nextLine()).equals("")) {
			String[] split = s.split(" ");
			int r1 = Integer.parseInt(split[0]);
			int c1 = Integer.parseInt(split[1]);
			r2 = Integer.parseInt(split[2]);
			c2 = Integer.parseInt(split[3]);
			r3 = Integer.parseInt(split[4]);
			c3 = Integer.parseInt(split[5]);
			a[r3][c3] = 1;
			a[r1][c1] = 1;
			Node k = new Node(r1,c1,0);
			q.offer(k);
			BFS();
			a = new int[10][10];
		}
		
	}
	static void BFS() {
		Node now = null;
		while(!q.isEmpty()) {
			now = q.poll();
			if(now.x==r2&&now.y==c2)
				break;
			for(int i=0;i<8;i++) {
				if(a[now.x+way[i][0]][now.y+way[i][1]]==1)
					continue;
				if(now.x+way[i][0]<1||now.x+way[i][0]>8||now.y+way[i][1]<1||now.y+way[i][1]>8)
					continue;
				Node next = new Node(now.x+way[i][0], now.y+way[i][1], now.step+1);
				a[now.x+way[i][0]][now.y+way[i][1]] = 1;
				q.offer(next);
			}
		}
		q.clear();
		System.out.println("Case "+time+":"+now.step);
		time++;
	}
}
class Node{
	
	public Node(int x, int y, int step) {
		this.x = x;
		this.y = y;
		this.step = step;
	}
	int x;
	int y;
	int step;
}
