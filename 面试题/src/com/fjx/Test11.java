package com.fjx;

public class Test11 {
	
	public static void main(String[] args) {
		String message = " name=wangerxiao age=24 clasNo=070497";
		String s = message.trim();
		String[] split = s.split(" ");
		for(String s2:split) {
			System.out.print(s2.split("=")[1]+" ");
		}
	}
}
