package com.fjx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) throws IOException {
		new Main1().function();
	}
	
	public void function() throws IOException {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("list.txt");
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		String s = null;
		int sum = 0;
		while(null!=(s = br.readLine())) {
			String[] split = s.split("\\s+");
			if(split[2].endsWith("уш")) {
//				new Integer()
				int index = split[2].indexOf("уш");
				String s1 = new String(split[2].substring(0,index));
				int num = Integer.parseInt(s1);
				if(num<10) {
					num*=10;
				}
				int n = (int)(100*Double.parseDouble(split[1]));
				
				sum+=n*num;
			}else {
				sum+=(int)(100*Double.parseDouble(split[1]))*50;
			}
			
		}
		System.out.println(sum/10000);
		
	}

}
