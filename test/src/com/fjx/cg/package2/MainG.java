package com.fjx.cg.package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainG {
	
	static Map<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n];
		int index = 0;
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			if(!map.containsKey(s)) {
				System.out.println("OK");
				map.put(s, 1);
			}else {
				Integer num = map.get(s);
				System.out.println(s+num);
				map.put(s, num+1);
			}
		}
	}

}
