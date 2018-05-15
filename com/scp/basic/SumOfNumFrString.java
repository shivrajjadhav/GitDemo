package com.scp.basic;

public class SumOfNumFrString {

	public static void main(String[] args) {
		
		
		String a="jklmn4567kfhkh456aghjg";

	    int sum = 0;

	    String num = "";

	    for(int i = 0; i < a.length(); i++) {
	        if(Character.isDigit(a.charAt(i))) {
	            num = num + a.charAt(i);
	        } else {
	            if(!num.equals("")) {
	                sum = sum + Integer.parseInt(num);
	                num = "";
	            }
	        }
	    }

	    System.out.println(sum);
	}
	}


