//w.a.p to compute the sum of the first 100 prime numbers.


package com.java;

import java.util.Scanner;

public class Q11 
{
  public static void main(String[] args) 
  {
	  Scanner s1=new Scanner(System.in);
	  System.out.println("prime number");
  	  System.out.println("2 3 5 7 9 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97");
  	int n=s1.nextInt();
  	int i,count=0,sum=0;
  	
  	for(i=1;i<=n;i++)
  	{
  		if(n%i==0)
  		{
  			count++;
  			sum=sum+count;
  		}
  	}
  	if(count==2)
  	{
  		System.out.println("prime number");
  	}
  	else
  	{
  		System.out.println("not prime number");
  	}
  	if(sum==count)
  	{
  		System.out.println("sum is"+sum);
  	}
  	     
     
  }      
     
}
