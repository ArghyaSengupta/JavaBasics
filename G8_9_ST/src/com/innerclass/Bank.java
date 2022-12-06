package com.innerclass;

public class Bank {

	//inner class1
	public class Account1{
		void msg() {
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
	 obj1.msg();
	 obj2.msg();
 
	}

}
