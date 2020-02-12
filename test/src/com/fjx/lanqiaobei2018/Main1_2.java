package com.fjx.lanqiaobei2018;

import java.util.Calendar;

public class Main1_2 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2000, 4, 4);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}

}
