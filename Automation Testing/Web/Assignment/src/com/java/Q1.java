//w.a.j.p to take three numbers from the user and print the greatest number

package com.java;

import java.util.Scanner;

public class Q1 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first no");
	  int a=sc.nextInt();
	  System.out.println("Enter second no");
	  int b=sc.nextInt();
	  System.out.println("Enter third no");
	  int c=sc.nextInt();
	  if(a>b&&a>c)
	  {
		System.out.println("a is grater "+a);  
	  }
	  else if (b>a&&b>c)
	  {
		  System.out.println("b is grater "+b);
	  }
	  else if(c>a&&c>b)
	  {
		  System.out.println("c is grater"+c);
	  }
	  else if (a==b && a==c)
	  {
		  System.out.println("all ar equal");
	  }
	  else 
	  {
		  System.out.println("not grater any value");
	  }
	}


		  
}

