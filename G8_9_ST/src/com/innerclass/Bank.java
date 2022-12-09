package com.innerclass;

public class Bank {

	int a=11;//non static -outter class member
	//inner class1
	 public class Account1{
		int a=10;
		void msg() {
			a=11;
			System.out.println("I am account 1");
		}
	}
	//innerclass2
	public class Account2{
		void msg() {
			System.out.println("I am account 2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Bank b= new Bank();
	 Bank.Account1 obj1=b.new Account1();
	 Bank.Account2 obj2=b.new Account2();
	 obj1.msg();//internally call the object
	 obj2.msg();
	
 
	}

}
