package com.fjx;

public class Demo {

	private static char[][] a = {{'��','��','��','��','��'},

					      {'��','��','��','��','��'},

					      {'��','��','��','��','��'},

					      {'��','��','��','��','��'}};

	

	private static int count; //��������

 

	public static void main(String[] args) {

		count = 0;

		char[] b = new char[8];

		jump(0, 0, 0, b);

		System.out.println(count);
		
		

	}

	

	/**

	 * ģ��С����Ծ���ӵĵݹ鷽��

	 * 

	 * @param step �����Ӿ����Ĳ�������Χ��0-7

	 * @param x ��������λ�ã���Χ��0-3

	 * @param y ��������λ�ã���Χ��0-4

	 * @param b �ݴ�����·�ߵ�һά����

	 */

	private static void jump(int step, int x, int y, char[] b){

		//*******�ݹ����**********

		if(x > 3){

			return;

		}

		

		if(y > 4){

			return;

		}

		

		if(step > 7){

			return;

		}

		

		//��¼��������

		b[step] = a[x][y];

				

		if(step == 7){

			//�պ��ߵ�8���ֵ�λ��

			if(check(b)){

				count++;

			}

			return;

		}

		

		jump(step+1, x+1, y, b); //������

		jump(step+1, x, y+1, b); //������

		

	}

	

	//������������ǡ��������������л���

	private static boolean check(char[] b){

		if("�������������л�".equals(String.valueOf(b))){

			return true;

		}else{

			return false;

		}

	}

}
