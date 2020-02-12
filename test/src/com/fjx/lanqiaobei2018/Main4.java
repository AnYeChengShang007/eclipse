package com.fjx.lanqiaobei2018;

public class Main4 {
	
	public static void main(String[] args) {
		System.out.println(solution(10,3));
	}
	
	public static int solution(int level,int num) {
		
		
		if(level==0)
			return 0;
		if(num==1) {
			return level;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=level;i++) {
			min = Math.min(min, Math.max(solution(level-1,num-1), solution(level-i,num)));
		}
		
		return min+1;
		
	}
	
	public static int solution2() {
		
		int[][] solution = new int[1000][3];
		for(int i=0;i<1000;i++) {
			solution[i][0] = i;
		}
		for(int i=1;i<1000;i++) {
			for(int j=1;j<=2;j++) {
				solution[i][j] = Math.min(solution[i-1][j-1], solution[1000-i][j]);
			}
		}
		
		return solution[999][2]+1;
		
	}

}
