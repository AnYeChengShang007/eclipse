package lanqiaobei2015;

public class Main2 {
	public static void main(String[] args) {
		
		for(long i=1; i<1000000000000000000l;i++) {
			if(i==function(i*i*i)) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static long function(long i) {
		long sum=0;
		while(i!=0) {
			sum+=i%10;
			i/=10;
		}
		return sum;
	} 
}
