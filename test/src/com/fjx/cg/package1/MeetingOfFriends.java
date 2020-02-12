package com.fjx.cg.package1;

import java.util.Scanner;

public class MeetingOfFriends {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l1 = sc.nextLong();
		long r1 = sc.nextLong();
		long l2 = sc.nextLong();
		long r2 = sc.nextLong();
		long k = sc.nextLong();
		long ans = Math.min(r1, r2)-Math.max(l2, l1)+1;
		if(k>=Math.max(l2, l1)&&k<=Math.min(r1, r2)) {
			ans--;
		}
		System.out.println(Math.max(0l, ans));
	}

}
