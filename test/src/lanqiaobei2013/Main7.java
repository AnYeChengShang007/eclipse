package lanqiaobei2013;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
//	注意使用集合调用get方法时返回的时一个对象，如果要进行比较相等要使用equals（）方法
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=0,n=0;
		List<Integer> list = new LinkedList<Integer>();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			String[] split = s.split(" ");
			for (String string : split) {
				list.add(Integer.parseInt(string));
			}
		}
		Collections.sort(list);
		int time = 0;
		for (int i = 1; i < list.size(); i++) {
			int a=list.get(i-1);
			int b=list.get(i);
			if(b-1!=a) {
				time++;
				if(b==a) {
					n=a;
				}else {
					m = b-1;
				}
				if(time==2) {
					break;
				}
			}
		}
		System.out.println("m="+m+",n="+n);
	}

}
