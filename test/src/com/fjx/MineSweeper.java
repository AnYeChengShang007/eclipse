package com.fjx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MineSweeper {
	static Scanner sc = new Scanner(System.in);
	static List<String[][]> list = new LinkedList<String[][]>();
	public static void main(String[] args) {
		int n=0;
		int m=0;
		while(sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			sc.nextLine();
			if(n==0 && m==0) {
				break;
			}
			process(n,m);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println("Filed #"+(i+1)+":");
			String[][] ss = list.get(i);
			for(int p=0;p<ss.length;p++) {
				for(int q=0;q<ss[0].length;q++) {
					System.out.print(ss[p][q]+"");
				}
				System.out.println();
			}
			
		}
		System.out.println("*/");
	}
	
	public static void process(int n,int m) {
		char[][] a = new char[n+2][m+2];
		for(int i=1;i<=n;i++) {
			String s = sc.nextLine();
			for(int j=1;j<=m;j++) {
				a[i][j] = s.charAt(j-1);
			}
		}
		String[][] ans = new String[n][m];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(a[i][j]!='*')
					ans[i-1][j-1] = getMineNumber(i, j, a)+"";
				else
					ans[i-1][j-1] ="*";
			}
		}
		list.add(ans);
	}
	
	public static int getMineNumber(int i,int j,char[][] cs) {
		int num = 0;
		for(int p=i-1;p<=i+1;p++) {
			for(int q=j-1;q<=j+1;q++) {
				if(cs[p][q]=='*') {
					num++;
				}
			}
		}
		return num;
	}
	
	
}
