package com.fjx.lanqiaobei2016;

public class Main2 {
	
	public static void main(String[] args) {
		for(int i=1; i<=100;i++) {
			for(int j=0; j<=100;j++) {
				if(i*(j+1)+(j+1)*j/2==236) {
					System.out.println(i+"  "+j);
				}
			}
		}
	}
	
	

}
