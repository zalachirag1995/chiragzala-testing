//w.a.j.p to print pattern

/*
 1
 01
 101
 0101
 10101
 */

package com.java;

public class Q8 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}

}
