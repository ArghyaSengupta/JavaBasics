package com.java.revise;

import java.util.Scanner;

//JVM will directly let the compiler know he properties of this marker interface
public class Product implements Cloneable{
	int pid;
	String pname;
	double pcost;
	
	public Product(int pid, String pname, double pcost) {
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public void showDetails() {
		System.out.println("Product id is"+pid);
		System.out.println("Product name is"+pname);
		System.out.println("Product cost is"+pcost);
	}
	//throw throws throwable
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter product id");
		int pid=sc.nextInt();
		System.out.println("Enter Product name");
		String pname=sc.next();
		System.out.println("Enter product cost");
		double pcost=sc.nextDouble();
		Product p1=new Product(pid, pname, pcost);
		Product p2=(Product)p1.clone();
		p2.showDetails();
		Product p3=(Product)p2.clone();
		p3.showDetails();
	}

}
