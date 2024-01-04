//w.a.p which will ask the user to enter his/her marks (out of 100). define a method that will display grades according to the 
//marks entered as below

package com.java;

import java.util.Scanner;

public class Q28 
{
 public static void main(String[] args) 
 {
	  Scanner sc1 = new Scanner(System.in);
	  System.out.println("Enter first no");
	  int a = sc1.nextInt();
	  if(a>=91 && a<=100)
	  {
		  System.out.println("A4");
	  }
	  else if(a>=81 && a<=90)
	  {
		  System.out.println("AB");
	  }
	  else if(a>=71 && a<=80)
	  {
		  System.out.println("BB");
	  }
	  else if(a>=61 && a<=70)
	  {
		  System.out.println("BC");
	  }
	  else if(a>=51 && a<=60)
	  {
		  System.out.println("CD");
	  }
	  else if(a>=41 && a<=50)
	  {
		  System.out.println("DD");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
	  
}
}
