package com.scp.basic;

import com.scp.basic.outer.Inner;

class outer{
	private int data=10;
	static void m2()
	{
		System.out.println("hello");
	}
	

class Inner{
	void m1()
	{
		System.out.println("data is "+data);
		
	}
}
}

public class TestInner {
	public static void main(String[] args) {
		

	outer o=new outer();
	outer.m2();
	
	Inner i2 = o.new Inner();
	i2.m1();
	
			
	}

}
