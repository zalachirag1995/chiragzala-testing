//w.a.p to demonstrate try catch block

package com.java;

import java.util.Scanner;

public class Q17 
{
  public static void main(String[] args) 
  {
	  try
	   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter no 1:");
	   int a=sc.nextInt();
	   System.out.println("Enter no 2");
	   int b=sc.nextInt();
	   int c=a/b;
	   System.out.println("division is.."+c);
	   
	  }
	  catch (Exception e)
    {
   	  System.out.println("not divisible");
    }
     
 }
}
