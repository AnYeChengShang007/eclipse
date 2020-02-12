package com.fjx;

import java.util.LinkedList;
import java.util.List;

public class Test6 {
	
	public static void main(String[] args) {
		String s =convert("123456789abcd", 5);
		System.out.println(s);
	}
	
	public static String convert(String s, int numRows) {
		
		if(s==null || s.length()==0) {
			return "";
		}
		
		List<StringBuilder> list = new LinkedList<StringBuilder>();
		for(int i=0; i<Math.min(s.length(),numRows); i++) {
			list.add(new StringBuilder());
		}
		
		int cur_index = 0;
		boolean flag = true;
		
		for(int i=0; i<numRows;) {
			if(cur_index>=s.length()) break;
			list.get(i).append(s.charAt(cur_index++));
			if(i==0 || i==numRows-1) {
				flag = !flag;
			}
			if(flag) {
				i--;
			}else {
				i++;
			}
		}
		String ss = "";
		for(int i=0; i<list.size(); i++) {
			ss+=list.get(i);
		}
		
		return ss;
    }

}
