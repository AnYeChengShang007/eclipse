package ���ű�����;

import java.util.Scanner;

public class �ֵ���ս����ΰ {
	
	public static void main(String[] args) {
		int[] a = new int[2];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			a[num]++;
			if(num==0) {
				if(a[num]>=21 && Math.abs(a[0]-a[1])>1) {
					System.out.println(0);
					break;
				}
			}else {
				if(a[num]>=21 && Math.abs(a[0]-a[1])>1) {
					System.out.println(1);
					break;
				}
			}
		}
		sc.close();
	}

}
