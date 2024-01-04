//w.a.j.p for create fibonacci series

package com.java;

import java.util.Scanner;

public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no");
		int temp=sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=temp;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
