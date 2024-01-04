//w.a.p to find the maximum and miniumum value of array

package com.java;

public class Q14 
{
 public static void main(String[] args) 
 {
	int a[] = {10,20,30,40,50};
	int max = a[0];
	int min = a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("maximum value\n"+max);
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("minimum value\n"+min);
 }
 
}
