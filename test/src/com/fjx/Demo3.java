package com.fjx;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println(f(65536,4));
	}
	
	public static long f(long a,long b) {
		while(a!=0) {
			long t = a;
			a = b%a;
			b = t;
		}
		return b;
	}
	
	@Test
	public void testName() throws Exception {
		System.out.println(65536   /4 );
	}
}
