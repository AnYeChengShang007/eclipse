package com.fjx.lanqiaobei.c2017;

public class Main2 {
	
	public static void main(String[] args) {
		/*for(int i=1;i<=10000;i++) {
			if(isSushu(i)) {
				g:for(int k=1;k<=1000;k++) {
					for(int j=1;j<=9;j++) {
						if(!isSushu(i+j*k)) {
							continue g;
						}
					}
					System.out.println(i+"  "+k);
					return;
				}
			}
		}*/
		for(int i=199,j=1;j<=10;i+=210,j++) {
			if(isSushu(i)) {
				System.out.println(i);
			}else {
				break;
			}
		}
		
	}
	
	static boolean isSushu(int i) {
		for(int j=2;j<Math.sqrt(i);j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}

}
