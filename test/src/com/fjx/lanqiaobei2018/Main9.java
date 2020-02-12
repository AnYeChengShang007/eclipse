package com.fjx.lanqiaobei2018;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
	
	public static void main(String[] args) {
		char[][] map = createMap();
		int num = islandNum(map);
		System.out.println(num);
		/*for(char[] row: map) {
			System.out.println(Arrays.toString(row));
		}*/
		int num2 = islandNum2(map);
		System.out.println(num2);
	}
	
	public static char[][] createMap(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char[][] map = new char[num][num];
		
		for(int i=0; i<num; i++) {
			String flag = sc.next();
			for(int j=0; j<num; j++) {
				char s = flag.charAt(j);
				map[i][j] = s;
			}
		}
		
		return map;
	}
	
	public static int islandNum(char[][] map) {
		
		/*char[][] map = new char[m.length][m.length];
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map.length;j++) {
				map[i][j] = m[i][j];
			}
		}*/
		
		
		int num = 0;
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map.length;j++) {
				if(dfs(map,i,j)) {
					num++;
				}
			}
		}
		
		return num;
	}
	public static int islandNum2(char[][] map) {
		
		/*char[][] map = new char[m.length][m.length];
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map.length;j++) {
				map[i][j] = m[i][j];
			}
		}*/
		
		
		int num = 0;
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map.length;j++) {
				if(dfs2(map,i,j)) {
					num++;
				}
			}
		}
		
		return num;
	}
	
	public static boolean dfs(char[][] map,int i,int j) {
		boolean b = false;
		if(i>=0 && i<map.length && j>=0 && j<=map.length && map[i][j]=='#') {
			b = true;
			if(i>0 && i<map.length && j>0 && j<map.length ) {
				if(map[i][j-1]=='.' ||map[i][j+1]=='.'||map[i-1][j]=='.'||map[i+1][j]=='.') {
					map[i][j] = '?';
				}else {
					map[i][j]='-';
				}
			}
			dfs(map,i,j+1);
			dfs(map,i,j-1);
			dfs(map,i+1,j);
			dfs(map,i-1,j);
		}
		return b;
	}
	
	public static boolean dfs2(char[][] map,int i,int j) {
		boolean b = false;
		if(i>=0 && i<map.length && j>=0 && j<=map.length && map[i][j]=='-') {
			b = true;
			map[i][j] = '?';
			dfs(map,i,j+1);
			dfs(map,i,j-1);
			dfs(map,i+1,j);
			dfs(map,i-1,j);
		}
		return b;
	}
	

}
