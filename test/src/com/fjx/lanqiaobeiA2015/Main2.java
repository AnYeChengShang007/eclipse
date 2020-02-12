package com.fjx.lanqiaobeiA2015;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main2 {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE, 9);
		c.add(Calendar.DAY_OF_YEAR, 1000);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
	}

}
