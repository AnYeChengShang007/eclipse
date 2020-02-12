package lanqiaobei2013;

public class Main2 {
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int num;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(num/24);
	}
	
	static void f(int index) {
		
		if(index>=9) {
			if((a[0]*10+a[1])*(a[2]*100+a[3]*10+a[4])==(a[0]*100+a[3]*10+a[1])*(a[2]*10+a[4])) {
				System.out.println(a[0]+""+a[1]+"*"+a[2]+""+a[3]+""+a[4]+"="+a[0]+""+a[3]+""+a[1]+"*"+a[2]+""+a[4]);
				num++;
			}
			return;
		}
		
		for(int i=index; i<a.length; i++) {
			int t = a[index];
			a[index] = a[i];
			a[i] = t;
			f(index+1);
			t = a[index];
			a[index] = a[i];
			a[i] = t;
		}
		
		
	}
}
