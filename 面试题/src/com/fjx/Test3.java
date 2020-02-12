package com.fjx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
	
	public static void main(String[] args) {
		System.out.println(function("bbbb"));
		
		
	}
	
	public static String function(String s) {
		int maxLength = 0;
		String max_str = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=s.length();j>=0;j--) {
				if(i<j) {
					String s1 = s.substring(i,j);
					if(yes(s1)) {
						if(maxLength<s1.length()) {
							maxLength = s1.length();
							max_str = s1;
						}
					}
				}
				
			}
		}
		return max_str;
	}
	
	public static boolean yes(String s) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		Collection<Integer> values = map.values();
		for(int i :values) {
			if(i>1) {
				return false;
			}
		}
		return true;
	}

}
