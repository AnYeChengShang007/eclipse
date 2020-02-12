package com.fjx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class kk {
	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new HashMap<String,Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		Set<String> set = map.keySet();
		String[] ss = new String[set.size()];
		boolean[] visit = new boolean[set.size()];
		int i=0;
		for(String s:set) {
			ss[i++] = s;
		}
		for(int p=0;p<visit.length;p++) {
			if(!visit[p]) {
				visit[p] = true;
				for(int j=p+1;j<visit.length;j++) {
					if(!visit[j]) {
						if(check(ss[p],ss[j])) {
							visit[j] = true;
							ans += map.get(ss[p])*map.get(ss[j]);
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean check(String string, String string2) {
		
		String[] s1 = string.split(" ");
		String[] s2 = string2.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equals(s2[i])) {
				return false;
			}
		}
		return true;
	}

	
	
}

