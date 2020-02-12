package com.fjx.cg.package2;

import java.util.Scanner;


public class MainL {
	static int[] a;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		SegTree tree = buildTree(0, a.length-1);
		for(int i=0;i<q;i++) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			if(a1==1) {
				updateTree(tree, a2-1, a3);
			}else {
				int query = query(tree, a2-1, a3-1);
				System.out.println(query);
			}
		}
	}
	
	static class SegTree{
		int l;
		int r;
		int sum;
		SegTree l_son;
		SegTree r_son;
	}
	
	static int query(SegTree tree,int i,int j) {
		int l = tree.l;
		int r = tree.r;
		int mid = (l+r)>>1;
		int ans = 0;
		
		if(i<=l&&j>=r)
			return tree.sum;
		
		if(i<=mid)
			ans+=query(tree.l_son, i, j);
		if(j>mid)
			ans+=query(tree.r_son, i, j);
		return ans;
		
	}
	
	static SegTree buildTree(int l,int r) {
		SegTree g = new SegTree();
		g.l = l;
		g.r = r;
		if(l==r) {
			g.sum = a[l];
			return g;
		}
		int mid = (l+r)/2;
		g.l_son = buildTree(l, mid);
		g.r_son = buildTree(mid+1, r);
		g.sum = g.l_son.sum+g.r_son.sum;
		return g;
	}
	
	
	static void updateTree(SegTree root,int i,int k) {
		//如果此节点为空
		if(root==null)
			return;
		
		int l = root.l;//左
		int r = root.r;//右
		root.sum+=k;//区间和
		int mid = (l+r)>>1;
		if(i<=mid)
			updateTree(root.l_son, i, k);
		else
			updateTree(root.r_son, i, k);
		
	}

}
