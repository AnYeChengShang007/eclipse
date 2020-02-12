package com.fjx.cg;

import java.util.Scanner;

public class Main3_2 {
	static int map[][] = new int[10][10];
	static int score;
	static int tan[][] = new int[10][10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	
	{
		int x=0,y=0;
		x = sc.nextInt();
		y = sc.nextInt();
		map[x][y] = 1;
		int n=0;
		n = sc.nextInt();
		sc.nextLine();
		print();
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			if(s.startsWith("f")){
				String[] split = s.split(" ");
				int a = Integer.parseInt(split[1]);
				int b = Integer.parseInt(split[2]);
				tan[a][b]=1;
				continue;
			}else if(s.equals("w")){
			if(x == 0){
				print();
				continue;
			}
			map[x][y]=0;
			x--;
			map[x][y]=1;
			}else if(s.equals("a")){
				if(y == 0){
					print();
					continue;
				}
				map[x][y]=0;
				y--;
				map[x][y]=1;
			}else if(s.equals("s")){
				if(x == 9){
					print();
					continue;
				}
				map[x][y]=0;
				x++;
				map[x][y]=1;
			}else if(s.equals("d")){
				if(y == 9){
					print();
					continue;
				}
				map[x][y]=0;
				y++;
				map[x][y]=1;
			}else if(s.equals("q"));
			if(tan[x][y] == 1){
				tan[x][y]=0;
				score++;
			}
			print();		
		}
		
	}

	static void print()
	{
		System.out.println("score:" + score);
		System.out.println("============");
		for (int i = 0; i < 10; i++) {
			System.out.print("|");
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 0) {
					if (tan[i][j] == 0)
						System.out.print(" ");
					else
						System.out.print("*");
				} else if (map[i][j] == 1)
					System.out.print("M");
			}
			System.out.println("|");
		}
		System.out.println("============");

	}

}
