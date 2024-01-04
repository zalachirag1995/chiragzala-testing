//w.a.p to create an abstract class 'parent' with method 'message'. it has two sub class each having a method with same name
//'message' that prints "this is first subclass" and " this is second subclass" respectively


package com.java;

class A
{
	public void setData()
	{
		System.out.print("message");
	}
}

class B extends A
{
	 public void setSportData()
	 {
		 System.out.print("this is first subclass");
	 }
}
 
class C extends B
{
	
	public void setResultdata()
	{
		
		System.out.println(); 
		System.out.print("this is second subclass");
	}
}

public class Q27 
{
 public static void main(String[] args) 
 {
   C c1 = new C();
   c1.setSportData();
   c1.setResultdata();
     
   
 }
}
