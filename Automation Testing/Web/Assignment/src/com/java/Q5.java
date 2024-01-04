//w.a.j.p to check given number is armstrong or not

package com.java;

import java.util.Scanner;

public class Q5 
{
    public static void main(String[] args) 
    {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter any no");
		int no=s2.nextInt();
		int copy=no,sum=0;
		while(no>0)
		{
			int t=no%10;
			sum=sum+(t*t*t);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Your no is armstrong.."+sum);
		}
		else
		{
			System.out.println("Your no is not armstrong.."+sum);
		}
		
		
		
	}
}
