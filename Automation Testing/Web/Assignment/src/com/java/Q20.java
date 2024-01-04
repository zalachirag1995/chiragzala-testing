//w.a.p to create one thread by extending thread class in another class

package com.java;

import com.java.*;

class First extends Thread
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
			System.out.println("My first Thread.."+i);
		}
		System.out.println("My first thread is completed..");
	}
}


public class Q20 
{
  public static void main(String[] args) 
  {

		First f1 = new First();
		f1.start();
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
			System.out.println("My main thread is."+i);
		}
		System.out.println("My main Thread is completed..");	  
  }
}
