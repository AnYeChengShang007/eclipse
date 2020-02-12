package lanqiaobei2014;

public class Mian2 {
	
	public static void main(String[] args) {
			System.out.println(fun(10));
	}
	
	public static int fun(int i) {
		
		if(i==0) return 2;
		if(i==1) return 3;
		
		return fun(i-1)+fun(i-2)+i-2;
	}

}
