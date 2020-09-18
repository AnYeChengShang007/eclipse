package com.fjx.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Exchange {
	/*public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println(a+"  "+b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a+"  "+b);
	}*/
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream(new BufferedOutputStream(
				new FileOutputStream("g:"+File.separator+"a.txt")
				));
		ps.println(123);
		ps.flush();
		
	}
}
