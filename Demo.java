package com.masai;

public class Demo {
	public Demo(){
		System.out.println("This is the default constructor");
	}
	public Demo(String s){
		System.out.println("Inside constructor of string: "+s);
	}
	public Demo(int i){
		System.out.println("Inside constructor of integer: "+i);
	}
	public Demo(float f){
		System.out.println("Inside constructor of float: "+f);
	}
	public static void main(String [] args) {
		Demo d1=new Demo();
		Demo d2=new Demo("Chaitali");
		Demo d3=new Demo(24);
		Demo d4=new Demo(44.4f);
	}
}
