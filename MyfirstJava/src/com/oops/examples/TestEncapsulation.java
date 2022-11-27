package com.oops.examples;

public class TestEncapsulation {
	public static void main(String args[]) {
	Account acc= new Account();//object or pojo
	acc.setAccount_no(1234);
	acc.setAmount(12);
	acc.setEmailID("test@gmail.com");
	acc.setName("Ram");
	
	System.out.println(acc.getAccount_no()+" "+acc.getAmount()+
			" "+acc.getEmailID()+" "+acc.getName());

}
}
