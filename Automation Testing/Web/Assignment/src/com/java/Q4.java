//w.a.j.p to check given number is prime or not

package com.java;

import java.util.Scanner;

public class Q4  
{
    public static void main(String[] args) 
    {
    	Scanner s1=new Scanner(System.in);
    	System.out.println("Enter any number");
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
