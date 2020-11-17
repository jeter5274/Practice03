package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int num, result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int i=num; i>0; i-=2) {
			result += i;
		}
		System.out.println("결과값 : " +result);
		sc.close();
	}

}
