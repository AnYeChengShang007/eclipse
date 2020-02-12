package com.fjx.lanqiaobei2018;

public class Main7 {
	
	public static void main(String[] args) {
		int x=-1000  ,y=-1000  ;
		int dx=0,dy=1;
		int l = 0;
		int step = 1;
		int ans = 0;
		int sw = 0;
		while(true) {
			switch(l) {
			case 0:
				for(int i=0;i<step;i++) {
					x--;
					ans++;
					if(x==dx&&y==dy) {
						System.out.println(ans);
						return;
					}
				}
				break;
			case 1:
				for(int i=0;i<step;i++) {
					y++;
					ans++;
					if(x==dx&&y==dy) {
						System.out.println(ans);
						return;
					}
				}
				break;
			case 2:
				for(int i=0;i<step;i++) {
					x++;
					ans++;
					if(x==dx&&y==dy) {
						System.out.println(ans);
						return;
					}
				}
				break;
			case 3:
				for(int i=0;i<step;i++) {
					y--;
					ans++;
					if(x==dx&&y==dy) {
						System.out.println(ans);
						return;
					}
				}
				break;
			}
			l++;
			l%=4;
			sw++;
			if(sw==2) {
				step++;
				sw=0;
			}
		}
	}

}
