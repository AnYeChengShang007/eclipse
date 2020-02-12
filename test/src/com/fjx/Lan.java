package com.fjx;

import java.util.HashMap;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

 

public class Lan {

	static String start=null;//��ʼ�ַ���

	static String end=null; //Ŀ���ַ���

	static int result = -1; //���

 

	public static int bfs(){

		Scanner scan = new Scanner(System.in);

		start = scan.next();

		end = scan.next();

		//memery���ڱ���֮ǰ״̬��key����״̬�ַ�����value����key״̬���õ���С����

		HashMap<String, Integer> memery = new HashMap<String, Integer>(100000);

		Queue<String> process = new LinkedList<String>(); //bfsʱ�õ��Ķ���

		memery.put(start, 0); //�����ʼ�ַ���

		process.offer(start); //�����ʼ���ַ���

		

		while(result == -1){//��û������������Ǽ�������

			String cur = process.poll(); //ȡ������Ԫ�أ����������

			int tmp = 0;

			while(tmp<cur.length()){//�ҵ��հ׿��λ��

				if(cur.charAt(tmp)=='.')break;

				tmp++;

			}

			int[] d = {-3,3,-1,1};//�������飬�ֱ��ʾ��������

			for(int i=0; i<4; i++){//����������Ԫ�ؽ���bfs

				int p = tmp + d[i];

				if(!(p<0||p>8||(p%3!=tmp%3&&p/3!=tmp/3))){//���������Խ������

					char a = cur.charAt(p);

					String change = cur.replace('.', '*'); //��*��ת���м���

					change = change.replace(a, '.');

					change = change.replace('*', a);

					

					if(change.equals(end)){

						result = memery.get(cur)+1;//memery.get(cur)+1 Ϊ�ӳ�ʼ״̬��Ŀǰ״̬��Ҫ�ߵĲ���

					}

					if(!memery.containsKey(change)){//���֮ǰû������״̬���������memery

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
