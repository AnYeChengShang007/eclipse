package com.fjx.cg;

import java.util.Scanner;

public class Main3 {
	
	static String[] commands;
	static Scanner sc = new Scanner(System.in);
	static int initX;
	static int initY;
	static int score;
	static int[][] m = new int[10][10];
	static {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				m[i][j] = -1;
			}
		}
	}
	
	
	public static void main(String[] args) {
		initX = sc.nextInt();
		initY = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		show();
		commands = new String[n];
		for(int i=0;i<n;i++) {
			commands[i] = sc.nextLine();
			excute(commands[i]);
		}
		
	}
	
	
	
	public static void excute(String cmd) {
		boolean ifShow = false;
		if(cmd.startsWith("f")) {
			String[] ss = cmd.split(" ");
			int x = Integer.parseInt(ss[1]);
			int y = Integer.parseInt(ss[2]);
			if(m[y][x]==-1) {
				m[y][x] = 1;
			}
		}else {
			if(cmd.equals("q")) {
				ifShow = true;
			}else if(cmd.equals("w")) {
				if(initX-1>=0) {
					initX-=1;
				}
				ifShow = true;
			}else if(cmd.equals("s")) {
				if(initX+1<=9) {
					initX+=1;
				}
				ifShow = true;
			}else if(cmd.equals("a")) {
				if(initY-1>=0) {
					initY-=1;
				}
				ifShow = true;
			}else {
				if(initY+1<=9) {
					initY+=1;
				}
				ifShow = true;
			}
		}
		if(ifShow) {
			getScore();
			show();
		}
	}
	
	public static void show() {
		System.out.println("score:"+score);
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				if(i==0 || i==11) {
					System.out.print("=");
				}else if(j==0 || j==11) {
					System.out.print("|");
				}else {
					if(m[j-1][i-1]==1) {
						System.out.print("*");
					}else if(initX+1==i && initY+1==j) {
						System.out.print("M");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void getScore() {
		if(m[initY][initX]!=-1) {
			m[initY][initX] = -1;
			score++;
		}
	}
	
}
