package com.fjx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestGaoSi {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1777);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 30);
		c.add(Calendar.DAY_OF_YEAR, 8113-1);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
	}
}
