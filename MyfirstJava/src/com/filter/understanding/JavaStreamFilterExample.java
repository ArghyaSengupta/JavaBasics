package com.filter.understanding;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a list of type of products
		List<Product> pList= new ArrayList<Product>();
		//floating or float number end with f
		pList.add(new Product(1,"laptop",2500f));//1
		pList.add(new Product(2,"laptop2",3500f));//2
		pList.add(new Product(3,"laptop3",4500f));//3
		//stream provides us with the inbuild functions
		//pList.stream().filter(p->p.price>3000f).forEach(System.out::println);
		pList.stream().filter(p->p.price>3000f).map(p->p.price).forEach(System.out::println);
	}

}
