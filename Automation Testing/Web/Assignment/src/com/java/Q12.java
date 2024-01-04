//w.a.p to sum values of an array

package com.java;

import java.util.Scanner;

public class Q12 
{
  public static void main(String[] args) 
  {
	int a[]= new int [5]; int sum=0;
	Scanner r = new Scanner(System.in);
	System.out.println("Enter array element ");
	
	for(int i=0;i<a.length;i++)
	{
	    a[i]=r.nextInt();	
	}
	System.out.print("Array element\n");
	for(int i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+" ");
	    sum=a[i]+sum;
	}
	System.out.println("\n\naddition of array element\n"+sum);
  }
}
