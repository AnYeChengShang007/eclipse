package 蓝桥杯试题;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;


public class 日期问题 {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	static long start;
	static long end;
	static TreeSet<Date> set = new TreeSet<Date>();
	static {
		try {
			start = sdf.parse("1960-1-1").getTime();
			end = sdf.parse("2059-12-31").getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split("/");
		f(Integer.parseInt("20"+split[0]),Integer.parseInt(split[1]),Integer.parseInt(split[2]));
		f(Integer.parseInt("19"+split[0]),Integer.parseInt(split[1]),Integer.parseInt(split[2]));
		f(Integer.parseInt("20"+split[2]),Integer.parseInt(split[0]),Integer.parseInt(split[1]));
		f(Integer.parseInt("19"+split[2]),Integer.parseInt(split[0]),Integer.parseInt(split[1]));
		f(Integer.parseInt("20"+split[2]),Integer.parseInt(split[1]),Integer.parseInt(split[0]));
		f(Integer.parseInt("19"+split[2]),Integer.parseInt(split[1]),Integer.parseInt(split[0]));
		for(Date date:)
	}
	
	public static void f(int year,int month,int day) {
		if(1960<=year&&year<=2059) {
			if(month>12) {
			}else if((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && day>31) {
			}else if((month==4||month==6||month==9||month==11)&&day>30) {
			}else if(!(year%4==0 || year%4!=0 && year%400==0) && month==2 && day>28) {
			}else if((year%4==0 || year%4!=0 && year%400==0) && month==2 && day>29) {
			}else {
				try {
					set.add(sdf.parse(year+"-"+month+"-"+day));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static boolean isRunNian(int year) {
		if(year%4==0 || year%4!=0 && year%400==0)
			return true;
		return false;
	}

}
