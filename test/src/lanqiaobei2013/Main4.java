package lanqiaobei2013;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


//0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911375
public class Main4 {
	
	public static void main(String[] args) {
//		BigDecimal f = f(10);
//		System.out.println(f);
		for(int i=1;i<=500;i++) {
			MyNum fun = fun(new BigInteger(i+""));
//			System.out.println(fun.fenzi);
//			System.out.println(fun.fenmu_2);
			BigInteger fenzi = fun.fenzi;
			BigInteger fenmu_2 = fun.fenmu_2;
//			System.out.println(fenzi);
//			System.out.println(fenmu_2);
			
			BigDecimal b1 = new BigDecimal(fenzi+"");
			BigDecimal b2 = new BigDecimal(fenmu_2+"");
			BigDecimal divide = b1.divide(b2, 103, BigDecimal.ROUND_HALF_DOWN);
			System.out.println(divide);
		}
	}
	
	public static MyNum fun(BigInteger num) {
		
		if(num.equals(new BigInteger("0"))) {
			return new MyNum(new BigInteger("1"),new BigInteger("2"));
		}
		
		MyNum m = new MyNum(new BigInteger("1"), fun(num.subtract(new BigInteger("1"))));
		
		return m;
	}
	
	/*public static BigDecimal f(int n) {
		
		if(n==0) {
			return new BigDecimal("1");
		}
		
		BigDecimal b = new BigDecimal("1");
		
		return b.divide(b.add(b.divide(f(n-1))));
		
	}*/

}

class MyNum{
	public BigInteger fenzi;
	public MyNum fenmu;
	public BigInteger fenmu_2;
	public MyNum(BigInteger fenzi, MyNum fenmu) {
		this.fenzi = fenzi;
		this.fenmu = fenmu;
		tongfen();
	}
	public MyNum(BigInteger fenzi, BigInteger fenmu_2) {
		this.fenzi = fenzi;
		this.fenmu_2 = fenmu_2;
	}
	
	public void tongfen() {
		if(fenmu!=null) {
			BigInteger a = fenmu.fenzi;
			BigInteger b = fenmu.fenmu_2;
			this.fenzi = b;
			this.fenmu_2 = b.add(a);
		}
	}
	
}
