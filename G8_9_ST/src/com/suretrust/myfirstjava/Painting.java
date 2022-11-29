package com.suretrust.myfirstjava;

//painting cannot be done without color
//so interface1 extends interface2
//parent : Color
//painting : child interface

//interfaces can inherit each other
//type same : class-classs
//interface-- interface
public interface Painting extends Color{

	//abstract
	void wallpainting();
	void ceilingpainting();
}
