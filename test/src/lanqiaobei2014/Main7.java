package lanqiaobei2014;

import java.util.TreeSet;

public class Main7 {
	
	static char[] a = {'A','A','2','2','3','3','4','4'};
	static TreeSet<String> set = new TreeSet<String>();
	
	
	public static void main(String[] args) {
		fun(0);
		System.out.println(set);
	}
	
	static boolean check(char[] a) {
		boolean b = true;
		String s = new String(a);
		int i1 = s.indexOf('A');
		int i2 = s.lastIndexOf('A');
		if(i2-i1-1!=1) 
			return false;
		i1 = s.indexOf('2');
		i2 = s.lastIndexOf('2');
		if(i2-i1-1!=2) 
			return false;
		i1 = s.indexOf('3');
		i2 = s.lastIndexOf('3');
		if(i2-i1-1!=3) 
			return false;
		i1 = s.indexOf('4');
		i2 = s.lastIndexOf('4');
		if(i2-i1-1!=4) 
			return false;
		return b;
	}
	
	public static void fun(int k) {
		if(k>=a.length) {
			if(check(a)) {
				set.add(new String(a));
			}
			return;
		}
		
		for(int i=k; i<a.length; i++) {
			char t = a[k];
			a[k] = a[i];
			a[i] = t;
			fun(k+1);
			t = a[k];
			a[k] = a[i];
			a[i] = t;
			}
	}
}
