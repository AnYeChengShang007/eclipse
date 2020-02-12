package com.fjx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Experiment {
	
	static int[][] dir = {
			{0,1},
			{1,0},
			{2,0},
			{0,2},
			{1,1}
	};

	static Queue<Condition> q = new LinkedList<Condition>();
	static Set<Condition> set = new HashSet<Condition>();
	
	public static void main(String[] args) {
		System.out.println("令c（x，y，z）为状态：x在左岸的牧师数量，"
				+ "y在左岸野人的数量，z{true：船在左岸；false：船在右岸}");
		System.out.println("令函数f（x，y）为动作：x，y从左往右（从右往左）移动的牧师和野人数");
		System.out.println("初始状态：c（3,3，true）");
		System.out.println("目标状态：c(0,0，false)");
		int[] a = {3,3};
		Condition c = new Condition(a, true);
		BFS(c);
	}
	
	static void BFS(Condition condition) {
		q.offer(condition);
		set.add(condition);
		while(!q.isEmpty()) {
			Condition now = q.poll();
			now.sb.append("c("+now.a[0]+","+now.a[1]+","+now.left+")\n");
			if(now.left==false) {
				if(now.a[0]==0 && now.a[1]==0) {
					System.out.println(now.sb);
					return;
				}
			}
			
			if(now.left) {
				for(int i=0;i<dir.length;i++) {
					int[] next = now.a.clone(); 
					next[0]-=dir[i][0];
					next[1]-=dir[i][1];
					if(ok(next)) {
						Condition nextC = new Condition(next,false);
						nextC.sb = new StringBuilder(now.sb);
						if(!set.contains(nextC)) {
							nextC.sb.append("f("+(-dir[i][0])+","+(-dir[i][1])+")\n");
							q.add(nextC);
							set.add(nextC);
						}
					}
				}
			}else {
				for(int i=0;i<dir.length;i++) {
					int[] next = now.a.clone(); 
					next[0]+=dir[i][0];
					next[1]+=dir[i][1];
					if(ok(next)) {
						Condition nextC = new Condition(next,true);
						nextC.sb = new StringBuilder(now.sb);
						if(!set.contains(nextC)) {
							nextC.sb.append("f("+(dir[i][0])+","+(dir[i][1])+")\n");
							q.add(nextC);
							set.add(nextC);
						}
					}
				}
			}
		}
	}
	
	static boolean ok(int[] a) {
		if(a[0]>=0 && a[1]>=0 && 3-a[0]>=0 && 3-a[1]>=0) {
			if((a[0]>=a[1] || a[0]==0) && (3-a[0]>=3-a[1] || 3-a[0]==0) )
				return true;
		}
		return false;
	}
}

class Condition{
	public int[] a = new int[2];
	public boolean left; 
	public StringBuilder sb = new StringBuilder();

	public Condition(int[] a, boolean left) {
		this.a = a;
		this.left = left;
	}

	

	@Override
	public String toString() {
		return "Condition [a=" + Arrays.toString(a) + ", left=" + left + ", sb=" + sb + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(a);
		result = prime * result + (left ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condition other = (Condition) obj;
		if (!Arrays.equals(a, other.a))
			return false;
		if (left != other.left)
			return false;
		return true;
	}
}
