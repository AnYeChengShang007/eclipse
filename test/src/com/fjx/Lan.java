package com.fjx;

import java.util.HashMap;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

 

public class Lan {

	static String start=null;//初始字符串

	static String end=null; //目标字符串

	static int result = -1; //结果

 

	public static int bfs(){

		Scanner scan = new Scanner(System.in);

		start = scan.next();

		end = scan.next();

		//memery用于保存之前状态，key代表状态字符串，value代表到key状态所用的最小步数

		HashMap<String, Integer> memery = new HashMap<String, Integer>(100000);

		Queue<String> process = new LinkedList<String>(); //bfs时用到的队列

		memery.put(start, 0); //放入初始字符串

		process.offer(start); //放入初始化字符串

		

		while(result == -1){//当没有搜索到结果是继续搜索

			String cur = process.poll(); //取到队首元素，并让其出队

			int tmp = 0;

			while(tmp<cur.length()){//找到空白块的位置

				if(cur.charAt(tmp)=='.')break;

				tmp++;

			}

			int[] d = {-3,3,-1,1};//方向数组，分别表示上下左右

			for(int i=0; i<4; i++){//对上下左右元素进行bfs

				int p = tmp + d[i];

				if(!(p<0||p>8||(p%3!=tmp%3&&p/3!=tmp/3))){//不允许出现越行问题

					char a = cur.charAt(p);

					String change = cur.replace('.', '*'); //让*当转换中间量

					change = change.replace(a, '.');

					change = change.replace('*', a);

					

					if(change.equals(end)){

						result = memery.get(cur)+1;//memery.get(cur)+1 为从初始状态到目前状态所要走的步数

					}

					if(!memery.containsKey(change)){//如果之前没有这种状态，则将其存入memery

						memery.put(change, memery.get(cur)+1); 

						process.add(change);

					}

				}

			}

		}

		

		return result;

	}

	public static void main(String[] args) {

		System.out.println(bfs());

	}

 

}
