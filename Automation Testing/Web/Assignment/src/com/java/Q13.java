//w.a.p to calculate the average value of array element

package com.java;

import java.util.Scanner;

public class Q13 
{
 public static void main(String[] args) 
 {
	   int a[]= new int [5], sum=0; 
	   double avg;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter array element ");
		
		for(int i=0;i<5;i++)
		{
		    a[i]=r.nextInt();	
		}
		System.out.print("\nArray element\n");
		
		for(int i=0;i<5;i++)
		{
		    System.out.print(a[i]+" ");
		    
		}
		
		for(int i=0;i<5;i++)
		{
		    sum=a[i]+sum;
		    
		}
		avg=sum/5;
		System.out.print("\n\naddition "+sum+"\naverage "+avg);	
 }
}
