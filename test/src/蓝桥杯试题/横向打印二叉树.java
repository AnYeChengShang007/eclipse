package ¿∂«≈±≠ ‘Ã‚;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ∫·œÚ¥Ú”°∂˛≤Ê ˜ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().split(" ");
		SortTreeNode tree = new SortTreeNode(Integer.parseInt(ss[0]));
		
		for(int i=1;i<ss.length;i++) {
			tree.add(Integer.parseInt(ss[i]));
		}
		tree.print(0,new ArrayList<Integer>());
	}
	
}

class SortTreeNode{
	
	SortTreeNode left;
	SortTreeNode right;
	int num;
	
	public SortTreeNode() {
	}
	public SortTreeNode(int num) {
		this.num = num;
	}
	
	public boolean hasChild() {
		return left!=null || right!=null;
	}
	
	public void add(int num) {
		if(this.num>num) {
			if(left == null) left = new SortTreeNode(num);
			else left.add(num);
		}else {
			if(right == null) right = new SortTreeNode(num);
			else right.add(num);
		}
	}
	
	public void print(int blank,List<Integer> list) {
		if(right!=null) {
			if(blank==0 && hasChild()) {
				list.add(blank+(num+"").length()+2);
				right.print(blank+(num+"").length()+1,list);
			}
			else {
				right.print(blank+(num+"").length()+3,list);
			}
		}
		if(blank==0) 
			System.out.println(num+"-|");
		else {
			for(int i=0;i<blank;i++)
				System.out.print(".");
			if(!hasChild())
				System.out.println("|-"+num);
			else
				System.out.println("|-"+num+"-|");
		}
		if(left!=null)
			if(blank==0 && hasChild())
				left.print(blank+(num+"").length()+1,list);
			else
				left.print(blank+(num+"").length()+3,list);
	}
}
