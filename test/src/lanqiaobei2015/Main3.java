package lanqiaobei2015;

public class Main3 {
	
	static int[] a = {0,1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		f(0);
	}
	
	public static void f(int k) {
		
		if(k==9) {
			if(a[4]!=0 && 1000*a[0]+91*a[1]-90*a[2]+a[3]-9000*a[4]-900*a[5]+10*a[6]-a[7]==0) {
				System.out.println(" "+a[0]+""+a[1]+""+a[2]+""+a[3]);
				System.out.println(" "+a[4]+""+a[5]+""+a[6]+""+a[1]);
				System.out.println(a[4]+""+a[5]+""+a[2]+""+a[1]+""+a[7]);
			}
		}
		
		for(int i=k;i<=9;i++) {
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			f(k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		
	}
}
