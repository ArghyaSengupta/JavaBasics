package com.suretrust.myfirstjava;

//calling the interface that has another parent interface
//results to define all the methods of child and parent interfaces
public class House implements Color, Painting{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House b1=new House();
		b1.wallpainting();//methods can onlye be called wrt objects
		b1.ceilingpainting();
		b1.primaryColor();
		b1.seconderyColor();
	}
	//parent
	@Override
	public String primaryColor() {
		// TODO Auto-generated method stub
		return "red";
	}

	//parent
	@Override
	public String seconderyColor() {
		// TODO Auto-generated method stub
		return "blue";
	}

	//child
	@Override
	public void wallpainting() {
		// TODO Auto-generated method stub
		System.out.println("wallpainting for house");
	}
//child
	@Override
	public void ceilingpainting() {
		// TODO Auto-generated method stub
		System.out.println("ceilingpainting for a house");
	}


	

	
	


	
}
