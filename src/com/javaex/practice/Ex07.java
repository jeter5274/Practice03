package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
			for(int col=0; col<row; col++) {
				System.out.print(row);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
