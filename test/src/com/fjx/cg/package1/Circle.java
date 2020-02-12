package com.fjx.cg.package1;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while(null!=(s=sc.nextLine())) {
			String[] split = s.split(" ");
			int x1 = Integer.parseInt(split[0]);
			int y1 = Integer.parseInt(split[1]);
			int x2 = Integer.parseInt(split[2]);
			int y2 = Integer.parseInt(split[3]);
			int x3 = Integer.parseInt(split[4]);
			int y3 = Integer.parseInt(split[5]);
			int xp = Integer.parseInt(split[6]);
			int yp = Integer.parseInt(split[7]);
			f(x1,y1,x2,y2,x3,y3,xp,yp);
		}
	}
	
	static void f(int x1,int y1,int x2,int y2,int x3,int y3,int xp,int yp) {
		double k1 = (double)(y2-y1)/(x2-x1);
		double k2 = (double)(y2-y3)/(x2-x3);
		double b1 = (y1+y2+k1*(x1+x2))/2;
		double b2 = (y2+y3+k2*(x2+x3))/2;
		double x = (b2-b1)/(1/k2-1/k1);
		double y = -1/k1*x+b1;
		double ans = Math.sqrt((xp-x)*(xp-x)+(yp-y)*(yp-y));
		double r = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		if((xp-x)*(xp-x)+(yp-y)*(yp-y)<=r*r) {
			double o1 = Math.sqrt((xp-x1)*(xp-x1)+(yp-y1)*(yp-y1));
			double o2 = Math.sqrt((xp-x2)*(xp-x2)+(yp-y2)*(yp-y2));
			double o3 = Math.sqrt((xp-x3)*(xp-x3)+(yp-y3)*(yp-y3));
			double max = o1;
			if(max<o2)
				max = o2;
			if(max<o3)
				max = o3;
			System.out.println(max);
			return;
		}
	}

}
