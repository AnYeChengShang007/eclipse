package lanqiaobei2015;

import java.util.Arrays;
import java.util.Stack;

public class Main6 {
	
	static int[] a = new int[50];
	static boolean[] flag = new boolean[48];
	
	public static void main(String[] args) {
		
		/*for(int i=1;i<=49;i++) {
			a[i] = i;
		}
		order(0,2);*/
		function2();
		
	}
	
	public static void order(int index,int num) {
		
//		在递归出口时一定要注意return
//		否则会出现无线递归
		if(num<=0) {
			function();
			return;
		}
		if(index>47) {
			return;
		}
		order(index+1,num);
		flag[index] = true;
		order(index+1,num-1);
		flag[index] = false;
		
	}
	
	public static void function() {
		Stack<String> flags = new Stack<String>();
		Stack<String> numbers = new Stack<String>();
		
		for(int i=0; i<flag.length; i++) {
			if(flag[i]==false)
				flags.push("+");
			else
				flags.push("*");
		}
		
		for(int i=1; i<=49; i++) {
			numbers.push(i+"");
		}
		
		while(flags.size()>1) {
			String s1 = flags.pop();
			String s2 = flags.pop();
			if(s1.equals("*")) {
				flags.push(s2);
				int n1 = Integer.parseInt(numbers.pop());
				int n2 = Integer.parseInt(numbers.pop());
				numbers.push((n1*n2)+"");
			}else if(s2.equals("*")) {
				int n1 = Integer.parseInt(numbers.pop());
				int n2 = Integer.parseInt(numbers.pop());
				int n3 = Integer.parseInt(numbers.pop());
				numbers.push(n1+n2*n3+"");
			}else if(s2.equals("+")) {
				flags.push("s2");
				int n1 = Integer.parseInt(numbers.pop());
				int n2 = Integer.parseInt(numbers.pop());
				numbers.push((n1+n2)+"");
			}
		}
		if(flags.size()>0) {
			int n1 = Integer.parseInt(numbers.pop());
			int n2 = Integer.parseInt(numbers.pop());
			String s1 = flags.pop();
			if(s1.equals("*")) {
				numbers.push((n1*n2)+"");
			}else {
				numbers.push((n1+n2)+"");
			}
		}
		
		int num = Integer.parseInt(numbers.pop());
		if(num==2015) {
			for(int i=0; i<flag.length;i++) {
				if(flag[i]==true) {
					System.out.println(i+1);
				}
			}
		}
	}
	
	//解法2
	public static void function2() {
		
		for(int i=1;i<=48;i++) {
			for(int j=48;j>=0;j--) {
				if(Math.abs(i-j)>1 && i<j) {
					if(1225-2*(i+j+1)+i*(i+1)+j*(j+1)==2015) {
						System.out.println(i+"  "+j);
					}
				}
			}
		}
		
		
	}

}
