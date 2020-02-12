package lanqiaobei2014;

public class Main6 {
	
	public static void main(String[] args) {
		int sum=0;
		int sum2=0;
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				for(int c=1;c<=9;c++) {
					for(int d=0;d<=9;d++) {
						if(true) {
							if(a==b && c==d) {
								sum2++;
								continue;
							}
							if((a*c)*(10*b+d)==(10*a+c)*b*d) {
								sum++;
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
