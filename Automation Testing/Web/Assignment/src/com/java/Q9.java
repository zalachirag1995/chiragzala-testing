//w.a.j.p to print pattern given below



/*
 	1
   2 2
  3 3 3
 4 4 4 4		
 */

package com.java;

public class Q9 
{
  public static void main(String[] args) 
  {
	 for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
