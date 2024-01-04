//w.a.p to create custom exception if customer withdraw amount which is grether than accoutn balance then program will show
//custom exception otherwise amount will deduct from account balance


package com.java;

import java.util.Scanner;

class VirajExcepation extends Exception
{
	double amount;
	public VirajExcepation(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+"rs deposited..");
	}
	public void withdrawal(double amount) throws VirajExcepation
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println(amount+"rs withdrawal succefuuly");
		}
		else
		{
			double needs=amount -balance;
			throw new VirajExcepation(needs);
		}
	}
}


public class Q29 
{
 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
		ATM a1 = new ATM();
		System.out.println("enter amount for deposit");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		System.out.println("enter amount for withdrawal");
		amount=sc.nextDouble();
		try
		{
			a1.withdrawal(amount);
			
		}catch (VirajExcepation e)
		{
			System.out.println("If your enter "+e.amount+" rs more into your account then you withdrawal "+amount+"rs");
		}

   	
 }	

}
