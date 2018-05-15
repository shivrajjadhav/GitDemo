package com.scp.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable  {

	private String empName;
    transient final int empId;
    static String address="abc";

	@Override
	public String toString() {
		return "Test [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}
    


	public Test(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}



	/*public Test(String empName, int empId, String address) {
		super();
		this.empName = empName;
		//this.empId = empId;
		this.address = address;
	}
*/


/*	public Test(int empId, String empName) {
		super();
		//this.empId = empId;
		this.empName = empName;
	}*/
}
class Seriliastion{
	 


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Test t1=new Test("shiv", 10);
		
	FileOutputStream fos=new FileOutputStream("E:\\shiv.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(t1);
	System.out.println(t1);
	
	FileInputStream fis=new FileInputStream("E:\\shiv.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Test t2=(Test)ois.readObject();
	ois.close();
	System.out.println(t2);

	}

}
