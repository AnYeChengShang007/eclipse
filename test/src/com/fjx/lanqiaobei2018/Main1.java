package com.fjx.lanqiaobei2018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main1 {
	
	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2000-4-5"));
		int i = c.get(Calendar.DAY_OF_YEAR);
		System.out.println(i);
		
	}

}
