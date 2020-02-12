package com.fjx.algorithm;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class EightNumberCode {
	static Set<Condition> set = new HashSet<Condition>();
	static Queue<Condition> q = new LinkedList<Condition>();
	static Condition end;
	static {
		end = new Condition(1, 1);
		end.a[0][0]=1;end.a[0][1]=2; end.a[0][2]=3; 
		end.a[1][0]=8;end.a[1][1]=0; end.a[1][2]=4; 
		end.a[2][0]=7;end.a[2][1]=6; end.a[2][2]=5; 
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Condition start = new Condition(1, 1);
		start.a[0][0]=1;start.a[0][1]=2; start.a[0][2]=3; 
		start.a[1][0]=7;start.a[1][1]=0; start.a[1][2]=4; 
		start.a[2][0]=6;start.a[2][1]=8; start.a[2][2]=5; 
		bfs(start);
	}
	
	static void bfs(Condition start) throws CloneNotSupportedException{
		q.offer(start);
		while(q.size()>0) {
			Condition now = q.poll();
			if(end.equals(now)) {
				System.out.println("ok");
				System.out.println(now.sb);
				return;
			}
			
			if(now.i-1>=0) {
				Condition next = (Condition) now.clone();
				next.swap(next.i, next.j, next.i-1, next.j);
				next.i-=1;
				if(!set.contains(next)) {
					next.sb.append("up\n");
					set.add(next);
					q.offer(next);
				}
			}
			if(now.i+1<3) {
				Condition next = (Condition) now.clone();
				next.swap(next.i, next.j, next.i+1, next.j);
				next.i+=1;
				if(!set.contains(next)) {
					next.sb.append("down\n");
					set.add(next);
					q.offer(next);
				}
			}
			if(now.j-1>=0) {
				Condition next = (Condition) now.clone();
				next.swap(next.i, next.j, next.i, next.j-1);
				next.j-=1;
				if(!set.contains(next)) {
					next.sb.append("left\n");
					set.add(next);
					q.offer(next);
				}
			}
			if(now.j+1<3) {
				Condition next = (Condition) now.clone();
				next.swap(next.i, next.j, next.i, next.j+1);
				next.j+=1;
				if(!set.contains(next)) {
					next.sb.append("right\n");
					set.add(next);
					q.offer(next);
				}
			}
		}
	}
	static class Condition implements Cloneable{
		@Override
		public String toString() {
			return Arrays.toString(a[0])
			+Arrays.toString(a[1])
			+Arrays.toString(a[2]);
		}
		StringBuilder sb = new StringBuilder();
		int i,j;
		@Override
		protected Object clone() throws CloneNotSupportedException {
			Condition c = new Condition(i, j);
			c.a = new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					c.a[i][j] = a[i][j];
				}
			}
			c.sb.append(sb.toString());
			return c;
		}
		public Condition(int i, int j) {
			this.i = i;
			this.j = j;
		}
		int[][] a = new int[3][3];
		@Override
		public int hashCode() {
			return super.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			Condition c = (Condition) obj;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(c.a[i][j]!=this.a[i][j])
						return false;
				}
			}
			if(c.i==this.i && c.j==this.j)
				return true;
			else
				return false;
		}
		void swap(int i,int j,int i2,int j2) {
			a[i][j]^=a[i2][j2];
			a[i2][j2]^=a[i][j];
			a[i][j]^=a[i2][j2];
		}
	}
}

