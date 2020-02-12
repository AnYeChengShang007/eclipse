package lanqiaobei2015;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main7 {
	
	static String[] a = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static int sum;
	public static void main(String[] args) {
		fun(0,"");
		System.out.println(sum);
	}
	
	public static void fun(int num,String cur) {
		
		if(num==13) {
			sum++;
			return;
		}
		if(cur.length()>13) {
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			if(count(cur,a[i])<4) {
				String s = cur;
				cur+=a[i];
				fun(num+1,cur);
				cur = s;
			}
		}
	}
	
	public static int count(String cur,String pai) {
		int num = 0;
		for(int i=0;i<cur.length();i++) {
			if((cur.charAt(i)+"").equals(pai))
				num++;
		}
		return num;
	}

}
