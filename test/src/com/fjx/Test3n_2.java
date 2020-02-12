package com.fjx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3n_2 {
	
	 static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while (sc.hasNext()) {
	      int i = sc.nextInt();
	      int j = sc.nextInt();
	      int a = i;
	      int b = j;
	      //¿Ó
	      if (i > j) {
	        a = j;
	        b = i;
	      }
	      int max = -1;
	      for (int k = a; k <= b; k++) {
	        Integer fk = map.get(k);
	        if (fk == null) {
	          fk = f(k);
	          map.put(k, fk);
	        }
	        max = Integer.max(max, fk);
	      }
	      System.out.println(i + " " + j + " " + max);
	    }
	  }

	  static int f(long k) {
	    int count = 1;
	    while (k != 1) {
	      if ((k & 1) == 0) {
	        k /= 2;
	      } else {
	        k = k * 3 + 1;
	      }
	      count++;
	    }
	    return count;
	  }

}
