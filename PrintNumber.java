package com.masai;

public class PrintNumber {
	public void printEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+(10-num%10));
		}
		else if(num%2!=0) {
			System.out.println(num);
		}else if(num<0) {
			System.out.println("Error");
		}
	}
	
	public static void main(String [] args) {
		PrintNumber pn=new PrintNumber();
		pn.printEvenOdd(12);
	}
}
