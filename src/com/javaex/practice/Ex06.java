package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int range;
		
		for(range=1; range<=100; range++) {
			if(range % 5 == 0 && range % 7 == 0) {
				System.out.println(range);
			}
		}

	}

}
