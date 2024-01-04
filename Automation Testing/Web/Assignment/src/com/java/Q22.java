//w.a.p to update specific array element by given element

package com.java;

import java.util.ArrayList;

public class Q22 
{
  public static void main(String[] args) 
  {
   ArrayList<String> a1 = new ArrayList<String>();
   
   a1.add("Black");
   a1.add("Red");
   a1.add("Orange");
   a1.add("White");
   a1.add("Grreen");
   System.out.println(a1);
   a1.set(1, "Pink");
   a1.set(4, "Blue");
   System.out.println(a1);
   
 }   
}
