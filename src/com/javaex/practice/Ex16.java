package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		int num, count=0, result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i % 5 == 0) {
				count++;
				result += i;
			}
		}
		System.out.println("5의 배수의 개수 : " +count);
		System.out.println("5의 배수의 합 : " +result);
		sc.close();
	}

}
