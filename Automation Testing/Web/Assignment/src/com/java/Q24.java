//w.a.p to copy one array into another


package com.java;

import java.util.Scanner;

public class Q24 
{
  public static void main(String[] args) 
  {
   int a[] = new int[5];
   int b[] = new int[5];
   Scanner r = new Scanner(System.in);
   System.out.print("Enter value in first array");
   for(int i=0;i<5;i++)
   {
	   a[i]=r.nextInt();
   }
       System.out.print("First array elements: ");
   for(int i=0;i<5;i++)
   {
	   System.out.print(a[i]+" ");
   }
   System.out.print("\nsecond array elements: ");
   for(int i=0;i<5;i++)
   {
	   b[i]=a[i];
	   System.out.print(b[i]+" ");
   }
 }
}
