package ¿∂«≈±≠ ‘Ã‚;

import java.util.Scanner;
import java.util.TreeSet;

public class ¥ÌŒÛ∆±æ› {
	
	static TreeSet<Integer> set = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int a = 0;
		int b = 0;
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			for(String s1:ss) {
				Integer number = Integer.parseInt(s1);
				if(set.contains(number)) {
					b = number;
				}else {
					set.add(number);
				}
			}
		}
		Integer[] arr = new Integer[set.size()];
		set.toArray(arr);
		int before = arr[0];
		for(int i=1;i<arr.length;i++) {
			int after = arr[i];
			if(after-before==2) {
				a = before+1;
				break;
			}
			before = after;
		}
		System.out.println(a+" "+b);
		sc.close();
	}

}
