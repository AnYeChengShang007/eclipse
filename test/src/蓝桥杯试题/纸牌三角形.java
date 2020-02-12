package À¶ÇÅ±­ÊÔÌâ;


public class Ö½ÅÆÈı½ÇĞÎ {
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int res;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(res/6);
	}
	
	public static void f(int k) {
		if(k==a.length-1) {
			check();
			return;
		}
		
		for(int i=k;i<a.length;i++) {
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			f(k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}
	
	public static void check() {
		if(a[0]+a[1]+a[3]+a[5]==a[0]+a[2]+a[4]+a[8] && a[0]+a[1]+a[3]+a[5]==a[5]+a[6]+a[7]+a[8])
			res++;
	}
}
