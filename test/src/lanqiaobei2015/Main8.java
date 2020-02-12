package lanqiaobei2015;

import java.util.Scanner;

public class Main8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(function(n,0));
	}
	
	public static int function(int shi,int kong) {
		int xinshi = (shi+kong)/3;
		int xinkong = (shi+kong)%3;
		
		if(xinshi+xinkong<3) {
			return shi+xinshi;
		}
		
		return function(xinshi,xinkong)+shi;
	}

}
