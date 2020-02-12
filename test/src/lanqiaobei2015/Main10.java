package lanqiaobei2015;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	
	static long ans;
	static Tree[] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		map = new Tree[n];
		for(int i=0;i<n;i++) {
			long cur = sc.nextLong();
			map[i] = new Tree(cur);
		}
		for(int i=0;i<n-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a<=b) {
				map[a-1].sons.add(map[b-1]);
			}else {
				map[b-1].sons.add(map[a-1]);
			}
		}
		
		ans = f(map[0]);
		System.out.println(ans);
		
	}
	
	static long f(Tree t) {
		if(t.weight<0) {
			long sum = t.weight;
			long max = t.weight;
			for(Tree t1:t.sons) {
				long cur = f(t1);
				if(cur>0) {
					sum+=cur;
				}
				if(max<cur)
					max = cur;
			}
			return max>sum?max:sum;
		}else {
			long num = t.weight;
			for(Tree t1:t.sons) {
				long cur = f(t1);
				if(cur>0) {
					num+=cur;
				}
			}
			return num;
		}
	}
	

}

class Tree{
	public long weight;
	public List<Tree> sons = new LinkedList<Tree>();
	
	public Tree(long weight) {
		super();
		this.weight = weight;
	}
	
	public String toString() {
		return weight+"";
	}
	
	
}
