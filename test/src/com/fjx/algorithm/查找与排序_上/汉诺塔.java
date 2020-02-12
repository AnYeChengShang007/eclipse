package com.fjx.algorithm.²éÕÒÓëÅÅÐò_ÉÏ;

public class ººÅµËþ {

	public static void f(int num,String A,String B,String C) {
		
		if(num==1) {
			System.out.println(A+"-->"+B);
			return;
		}
		
		f(num-1,A,C,B);
		System.out.println(A+"-->"+B);
		f(num-1,C,B,A);
	}
	
	public static void main(String[] args) {
		f(4,"A","B","C");
	}
}
