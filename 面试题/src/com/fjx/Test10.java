package com.fjx;

public class Test10 {
	public static void main(String[] args) {
		
	}
	
	public static boolean isMatch(String s, String p) {
		
		if(s.length()==0 && p.length()==0) {
			return true;
		}
		if(s.length()==0 && p.length()!=0 || s.length()!=0 && p.length()==0) {
			return false;
		}
		
        StringBuilder str = new StringBuilder(s);
        StringBuilder reg = new StringBuilder(p);
        
        if(p.charAt(0)=='.' && p.charAt(1)=='*') {
        	if(2<p.length()) {
        		
        	}
        	
        	
        }
        
		
		return false;
    }

}
