package lanqiaobei2014;

public class Main5 {
	
	public static void main(String[] args) {
		double x = 111; 
		for(int n = 10000; n>=0; n--){
			int i = 2 * n + 1;
			x = 2 + (i*i / x);
		}
		
		System.out.println(String.format("%.4f", 4/(x-1)));
	}

}
