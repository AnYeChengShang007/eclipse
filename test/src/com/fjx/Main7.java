package com.fjx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

public class Main7 {
	
	public static void main(String[] args) throws ParseException {
		function("61/03/04");
		
	}
	
	public static void function(String s){
		int num1 = Integer.valueOf((s.charAt(0)-'0')*10+s.charAt(1)-'0');
		int num2 = Integer.valueOf((s.charAt(3)-'0')*10+s.charAt(4)-'0');
		int num3 = Integer.valueOf((s.charAt(6)-'0')*10+s.charAt(7)-'0');
		String d1 = case1(num1,num2,num3);
		String d2 = case1(num3,num2,num1);
		String d3 = case1(num3,num1,num2);
		TreeSet<String> treeSet = new TreeSet<String>();
		if(d1!="")	
			treeSet.add(d1);
		if(d2!="")	
			treeSet.add(d2);
		if(d3!="")	
			treeSet.add(d3);
		for(String s1: treeSet) {
			System.out.println(s1);
		}
	}
	
	public static String case1(int num1,int num2,int num3) {
		boolean isRun = false;
		
		if(num1>=0 && num1<=59) {
			num1+=2000;
		}else {
			num1+=1900;
		}
		
		if(num1%400==0 || num1%400!=0 && num1%4==0) {
			isRun = true;
		}
		if(num2>12 || num2<1) {
			return "";
		}
		if(num3<=0) 
			return "";
		switch(num3) {
			case 1:
				if(num3>31)
					return "";
				break;
			case 2:
				if(isRun && num3>29)
					return "";
				else if(!isRun && num3>28)
					return "";
				break;
			case 3:
				if(num3>31)
					return "";
				break;
			case 4:
				if(num3>30)
					return "";
				break;
			case 5:
				if(num3>31)
					return "";
				break;
			case 6:
				if(num3>30)
					return "";
				break;
			case 7:
				if(num3>31)
					return "";
				break;
			case 8:
				if(num3>31)
					return "";
				break;
			case 9:
				if(num3>30)
					return "";
				break;
			case 10:
				if(num3>30)
					return "";
				break;
			case 11:
				if(num3>31)
					return "";
				break;
			case 12:
				if(num3>31)
					return "";
				break;
			}
		
		
		return num1+"/"+num2+"/"+num3;
	}

}
