package com.fjx;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ExcelAddress {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			
		}
		System.out.println(sb);
	}
	
	static String getSign(int num) {
		return (char)('A'+num-1)+"";
	}
	
}
