package lanqiaobei2015;

public class Main7_2 {
	static String[] a = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static int ans;
	public static void main(String[] args) {
		fun(0,0);
		System.out.println(ans);
	}
	
	public static void fun(int k,int sum) {
		
		if(k==13 && sum==13) {
			ans++;
			return;
		}
		if(k>13 || sum>13) {
			return;
		}
		
		for(int i=0;i<5;i++) {
			fun(k+1,sum+i);
		}
	}

}
