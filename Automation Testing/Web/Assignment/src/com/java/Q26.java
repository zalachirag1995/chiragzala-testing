//w.a.p to find the second largest element in array


package com.java;

import java.util.Scanner;

public class Q26 
{
 public static void main(String[] args) 
 {
    int temp;
    int a[] = new int [] {45,95,85,75,65,25,55};
    {
    	for(int i=0; i<a.length; i++)
    	{
    		for (int j=i+1; j<a.length; j++)
    		{
    			if(a[i]<a[j])
    			{
    				temp = a[i];
    				a[i] = a[j];
    				a[j] = temp;
    			}
    		}
    	}
    	System.out.println("The sorted array..");
    	for(int i=0; i<a.length; i++)
    	{
    		System.out.println(a[i]+ " ");
    	}
    	System.out.println();
    	System.out.println("The second largest element is.."+a[1]);
    }
 }
}
