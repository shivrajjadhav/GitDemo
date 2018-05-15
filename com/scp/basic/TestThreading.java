package com.scp.basic;

import java.util.concurrent.TimeUnit;

public class TestThreading {

	public static void main(String[] args) throws InterruptedException {
		
	/*MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	MyThread t3=new MyThread();
	t2.start();
	t1.start();
	//t1.yield();
	t1.join();
	t3.start();*/

	
	MyThreadRunnable th1=new MyThreadRunnable();
	
	Thread tr1=new Thread(th1, "Thread1");
	Thread tr2=new Thread(th1, "Thread2");
	Thread tr3=new Thread(th1, "Thread3");
	tr2.start();
	//tr2.join();
	tr2.yield();
	tr1.start();
	tr3.start();
	
	
	
	
	
	 
	}
	
}	
		
/* class MyThread extends Thread{
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("i value--"+i);
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	

}*/
 
 class MyThreadRunnable implements Runnable{

	

	@Override
	
	public void run() {
		for(int i=0;i<10;i++){
			
			
			if(i==5)
			try{
				
				TimeUnit.SECONDS.sleep(10);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"==="+i);
		}
		
	}
	 
 }
 