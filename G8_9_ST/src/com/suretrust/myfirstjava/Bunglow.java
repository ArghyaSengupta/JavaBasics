package com.suretrust.myfirstjava;

public class Bunglow implements Color,Painting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bunglow b1=new Bunglow();
		b1.wallpainting();//methods can onlye be called wrt objects
		b1.ceilingpainting();
		b1.primaryColor();
		b1.seconderyColor();
	}

	@Override
	public void wallpainting() {
		// TODO Auto-generated method stub
		System.out.println("wallpainting for bunglow");
	}

	@Override
	public void ceilingpainting() {
		// TODO Auto-generated method stub
		System.out.println("ceilingpainting for bunglow");
	}

	@Override
	public String primaryColor() {
		// TODO Auto-generated method stub
		return "green";
	}

	@Override
	public String seconderyColor() {
		// TODO Auto-generated method stub
		return "indigo";
	}

}
