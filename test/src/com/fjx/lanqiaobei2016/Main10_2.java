package com.fjx.lanqiaobei2016;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main10_2 {
	static int[] nums;
	static int[] nums2;
	static int[] b;
	static SegTree segTree;
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nums = new int[n];
		nums2 = new int[n];
		b = new int[n];
		segTree = buildTree(0, n-1);
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			Integer num = map.get(nums[i]);
			if(num!=null) {
				int ans = query(segTree,num+1,i-1);
				nums2[i] = ans;
				b[num] = 0;
				updateTree(segTree, num, -1);
				b[i] = 1;
				updateTree(segTree, i, 1);
			}else {
				nums2[i] = -nums[i];
				b[i] = 1;
				updateTree(segTree, i, 1);
			}
			map.put(nums[i], i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.println();
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
			g.sum = b[l];
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
