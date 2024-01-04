//w.a.p to iterate through all elements in array list

package com.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q21 
{
  public static void main(String[] args) 
  {
   ArrayList<String> fruits = new ArrayList<String>();
   fruits.add("Mango");
   fruits.add("Apple");
   fruits.add("Strawberry");
   System.out.println("my fvt. fruits are"+fruits);
   System.out.println("\nusing listiterator..\n");
   ListIterator<String> itrate = fruits.listIterator();
   while(itrate.hasNext())
   {
	   System.out.println(itrate.next());
   }
   
  }   
}
