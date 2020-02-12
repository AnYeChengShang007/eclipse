package com.fjx;

public class EightQueen {
	
	public static int n=0;
	
	public static void main(String[] args) {
		boolean[][] condition = new boolean[8][8];
		eightQueen(condition, 0);
	}
	
	public static void eightQueen(boolean[][] condition, int row) {
		
		if(row==8) {
			System.out.println((n++)+":");
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					System.out.print(condition[i][j]+"  ");
				}
				System.out.println();
			}
			return;
		}
		
		
		for(int i=0; i<8; i++) {
			if(pump(condition,row,i)) {
				continue;
			}else {
				condition[row][i] = true;
				eightQueen(condition, row+1);
				condition[row][i] = false;
			}
		}
	}
	
	public static boolean pump(boolean[][] condition,int row,int column) {
		for(int i=row-1,j=column-1;i>=0 && j>=0;i--,j--) {
			if(condition[i][j]==true) return true;
		}
		
		for(int i=row+1,j=column+1;i<8 && j<8;i++,j++) {
			if(condition[i][j]==true) return true;
		}
		for(int i=row-1,j=column+1;i>=0 && j<8;i--,j++) {
			if(condition[i][j]==true) return true;
		}
		
		for(int i=row+1,j=column-1;i<8 && j>=0; i++,j--) {
			if(condition[i][j]==true) return true;
		}
		
		
		for(int i=row,j=0;j<8;j++) {
			if(i==row && j!= column && condition[i][j]) return true;
		}
		for(int i=0,j=column;i<8;i++) {
			if(i!=row && j== column && condition[i][j]) return true;
		}
		return false;
	}

}
