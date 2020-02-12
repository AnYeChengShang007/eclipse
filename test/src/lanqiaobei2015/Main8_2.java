package lanqiaobei2015;

import java.util.Scanner;

public class Main8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n>=3) {
			n-=2;
			ans+=3;
		}
		ans+=n;
		System.out.println(ans);
	}
}
