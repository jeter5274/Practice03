package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int row = 1; row <=10; row++) {
			for(int col=0; col<=10; col++) {
				int result = row+col;
				System.out.print(result+ "\t");
			}
			System.out.println("");
		}

	}

}
