package com.fjx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test8 {
	
	public static void main(String[] args) {
		List<Elephone> list = new ArrayList<Elephone>(1000);
		for(int i=0;i<1000;i++) {
			list.add(new Elephone(i, (int)(Math.random()*10000),(int)(Math.random()*10000)));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	static class Elephone implements Comparable<Elephone>{
		int num;
		int w;
		int iq;
		
		public Elephone(int num, int w, int iq) {
			this.num = num;
			this.w = w;
			this.iq = iq;
		}


		@Override
		public int compareTo(Elephone o) {
			if(this.w<o.w)
				return -1;
			if(this.w>o.w)
				return 1;
			if(this.w==o.w) {
				if(this.iq>o.iq)
					return -1;
				if(this.iq<o.iq)
					return 1;
			}
			return 0;
		}


		@Override
		public String toString() {
			return "[num=" + num + ", w=" + w + ", iq=" + iq + "]";
		}
		
		
		
	}

}
