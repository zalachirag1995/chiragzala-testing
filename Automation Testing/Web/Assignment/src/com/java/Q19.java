//w.a.p to create one thread by implementing runnable interface in class


package com.java;

import com.java.*;

class Second implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My second Thread is.."+i);
		}
		System.out.println("My seocnd thread is completed...");
	}
}






public class Q19 
{
  public static void main(String[] args) 
  {
	  Second s1 = new Second();
		Thread t1 = new Thread(s1);
		t1.start();
		for(int i=1;i<=5;i++)
		{
		   try 
		   {
			Thread.sleep(2000);
		   }    catch (InterruptedException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }	
		   System.out.println("My main thread is.."+i);
		}
		System.out.println("My main Thread is completed...");
 }
}
