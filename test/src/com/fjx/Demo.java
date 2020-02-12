package com.fjx;

public class Demo {

	private static char[][] a = {{'从','我','做','起','振'},

					      {'我','做','起','振','兴'},

					      {'做','起','振','兴','中'},

					      {'起','振','兴','中','华'}};

	

	private static int count; //计数变量

 

	public static void main(String[] args) {

		count = 0;

		char[] b = new char[8];

		jump(0, 0, 0, b);

		System.out.println(count);
		
		

	}

	

	/**

	 * 模拟小明跳跃格子的递归方法

	 * 

	 * @param step 跳格子经过的步数，范围是0-7

	 * @param x 向下跳的位置，范围是0-3

	 * @param y 向右跳的位置，范围是0-4

	 * @param b 暂存跳过路线的一维数组

	 */

	private static void jump(int step, int x, int y, char[] b){

		//*******递归出口**********

		if(x > 3){

			return;

		}

		

		if(y > 4){

			return;

		}

		

		if(step > 7){

			return;

		}

		

		//记录跳过的字

		b[step] = a[x][y];

				

		if(step == 7){

			//刚好走到8个字的位置

			if(check(b)){

				count++;

			}

			return;

		}

		

		jump(step+1, x+1, y, b); //向下跳

		jump(step+1, x, y+1, b); //向右跳

		

	}

	

	//检查数组内容是“从我做起振兴中华”

	private static boolean check(char[] b){

		if("从我做起振兴中华".equals(String.valueOf(b))){

			return true;

		}else{

			return false;

		}

	}

}
