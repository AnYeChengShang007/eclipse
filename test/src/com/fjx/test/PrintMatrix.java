package com.fjx.test;

import java.util.Arrays;

public class PrintMatrix {
	static int[][] a = new int[4][5];
	static {
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++) {
				a[i][j] = i*5+j+1;
			}
		}
	}
	
	public static void main(String[] args) {
		printMatrix();
	}
	
	static void printMatrix() {
		int i=0,j=0,down=a.length,right=a[0].length,left=0,up=0;
		
		while(left<=right && up<=down) {
			i=left;
			j=up;
			for(;i<right;i++)
				System.out.print(a[j][i]+" ");
			i--;
			j++;
			for(;j<down;j++)
				System.out.print(a[j][i]+" ");
			j--;
			i--;
			for(;i>=left;i--) {
				System.out.print(a[j][i]+" ");
			}
			i++;
			j--;
			for(;j>up;j--) {
				System.out.print(a[j][i]+" ");
			}
			j++;
			right--;
			down--;
			left++;
			up++;
		}
	}
}
