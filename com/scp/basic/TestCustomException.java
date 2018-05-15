package com.scp.basic;

public class TestCustomException {
	
	public static void main(String[] args) {
		
		try{
		 validate(20);	
			
		}catch(Exception e){
			System.out.println("Exception occur"+e);
		}
		//System.out.println("rest of code");
	}

	private static void validate(int age) throws InvalidAgeException {
		
		if(age<18){
			throw new InvalidAgeException("not valid");
			
		}else{
			System.out.println("welcome to vote");
		}
		
	}

}
class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s) {
		super(s);
		
	}
}
