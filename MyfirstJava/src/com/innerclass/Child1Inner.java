package com.innerclass;

public class Child1Inner extends CallOuterFromInner{
	
	public static void main (String argss[]) {
	CallOuterFromInner co= new Child1Inner();
	CallOuterFromInner.InnerClass obj = new CallOuterFromInner.InnerClass();
	co.msg1();
	obj.msg();
	}

}
