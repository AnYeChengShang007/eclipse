package ¿∂«≈±≠ ‘Ã‚;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Õ¯¬Á—∞¬∑ {
	static int res;
	static List<Integer>[] points;
	static boolean[] vis;
	
	public static void main(String[] args) throws IOException {
		makePic(points);
		System.out.println(res);
	}
	
	public static void makePic(List<Integer>[] pic) throws IOException {
		BufferedReader sc = new BufferedReader(
				new InputStreamReader(System.in)
				);
		String[] split = sc.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		vis = new boolean[n+1];
		Arrays.fill(vis, false);
		points = new List[n+1];
		for(int i=1;i<=n;i++) {
			points[i] = new LinkedList<Integer>();
		}
		for(int i=0;i<m;i++) {
			String[] split1 = sc.readLine().split(" ");
			int a = Integer.parseInt(split1[0]);
			int b = Integer.parseInt(split1[1]);
			points[a].add(b);
			points[b].add(a);
		}
		for(int i=1;i<=n;i++) {
			vis[i] = true;
			dfs(i,i,1);
			vis[i] = false;
		}
	}
	
	public static void dfs(int t,int start,int step) {
		
		for(int i=0;i<points[t].size();i++) {
			Integer next = points[t].get(i);
			
			if(step==3) {
				if(start==next||!vis[next]) {
					res++;
					continue;
				}
			}
			
			if(!vis[next]) {
				vis[next] = true;
				dfs(next,start,step+1);
				vis[next] = false;
			}
		}
		
	}
	
	
	
	
}
