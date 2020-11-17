package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	
		int num, result=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			result += i;
			System.out.print(i);
			
			if(i==num) {
				System.out.println("");
			}else {
				System.out.print("+");
			}
		}
		
		System.out.println("합계 : " +result);
		sc.close();
	}

}
