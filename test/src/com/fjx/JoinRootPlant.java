package com.fjx;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JoinRootPlant {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] root = new int[m*n+1];
		int[] h = new int[m*n+1];
		for(int i=1;i<=m*n;i++) {
			root[i] = -1;
		}
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			join(num1,num2,root,h);
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i=1;i<root.length;i++) {
			set.add(getRoot(i, root));
		}
		System.out.println(set.size());
	}
	
	static void join(int num1,int num2,int[] root,int[] h) {
		int root1 = getRoot(num1, root);
		int root2 = getRoot(num2, root);
		if(root1!=root2) {
			if(h[root1]>h[root2]) {
				root[root2] = root1;
			}else if(h[root1]<h[root2]) {
				root[root1] = root2;
			}else {
				root[root1] = root2;
				h[root2]++;
			}
		}
	}
	
	static int getRoot(int num,int[] root) {
		if(root[num]==-1)
			return num;
		else
			return getRoot(root[num],root);
	}

}
