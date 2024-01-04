//w.a.p to demonstrate multiple catch block

package com.java;

public class Q18  
{
  public static void main(String[] args) 
  {
    	int a = 8526;
    	int b = 0;
    	int[] f = new int [5];
    	try
    	{
    		int c=a/b;
    		System.out.println("f[2]");
    		System.out.println("f[6]");
    		System.out.println(c);
    	
    	}catch(ArithmeticException e)
    	{
    		System.out.println("print the reason..");
    		System.out.println(e);
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("print the reason..");
    		System.out.println(e);
    	}
 }
}
