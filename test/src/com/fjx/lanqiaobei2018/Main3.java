package com.fjx.lanqiaobei2018;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main3 {
	public static void main(String[] args) throws IOException {
		ciFang(123456, new Fushu("2","3"));
//		System.out.println(Long.MAX_VALUE);
	}
	
	public static void ciFang(int n,Fushu f1) throws IOException {
		Fushu f2 = f1;
		for(int i=0; i<n-1; i++) {
			f2 = f1.xiangChen(f2);
		}
		BufferedWriter br = new BufferedWriter(new FileWriter("g:/a.txt"));
		br.write(f2.toString());
		br.flush();
		br.close();
	}
}


class Fushu{
	public Fushu(String a, String b) {
		super();
		this.a = new BigInteger(a);
		this.b = new BigInteger(b);
	}

	public BigInteger a;
	public BigInteger b;
	
	public Fushu xiangChen(Fushu other) {
		Fushu xin= new Fushu("0","0");
		BigInteger a1a2 = this.a.multiply(other.a);
		BigInteger a1b2 = this.a.multiply(other.b);
		BigInteger a2b1 = this.b.multiply(other.a);
		BigInteger b1b2 = this.b.multiply(other.b);
		xin.a = a1a2.subtract(b1b2);
		xin.b = a1b2.add(a2b1);
		return xin;
	}
	
	public String toString() {
		if(b.compareTo(BigInteger.ZERO)>0)
			return a.toString()+"+"+b.toString()+"i";
		else
			return a.toString()+""+b.toString()+"i";
	}
	
}