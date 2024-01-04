//w.a.p to remove the third element from a array list

package com.java;

import java.util.ArrayList;

public class Q23 
{
   public static void main(String[] args) 
   {
	  ArrayList a1 = new ArrayList();
	  System.out.println("Default size is "+a1.size());
	  System.out.println("Default value is "+a1);
	  a1.add(123);
	  a1.add("chirag");
	  a1.add(78.65f);
	  System.out.println("Default size is "+a1.size());
	  System.out.println("Default value is "+a1);
	  a1.remove(2);
	  System.out.println("Default size is "+a1.size());
	  System.out.println("Default value is "+a1);
   }
}
