package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int money=0;
		//int flag=0; 스위치문 사용시 반복문을 빠져나가기 위해 사용
		
		while(true) {
			
			int flow_money;
			
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");

			System.out.print("선택>");
			int choice = sc.nextInt();
			
			
			if(choice == 1) {
				System.out.print("예금액>");
				flow_money = sc.nextInt();
				money += flow_money;
			}else if(choice == 2) {
				System.out.print("출금액>");
				flow_money = sc.nextInt();
				money -= flow_money;
			}else if(choice == 3) {
				System.out.print("잔고액>");
				System.out.println(money);
			}else if(choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}

			/*
			switch(choice) {	//스위치의 break는 스위치 문구를 빠져나감
				case 1 : 
					System.out.print("예금액>");
					flow_money = sc.nextInt();
					money += flow_money;
					break;
				case 2 :
					System.out.print("출금액>");
					flow_money = sc.nextInt();
					money -= flow_money;
					break;
				case 3 : 
					System.out.print("잔고액>");
					System.out.println(money);
					break;
				case 4 :
					System.out.println("프로그램 종료");
					flag = 1;
					break;
				default :
					System.out.println("다시입력해주세요");
				
			}
			if(flag == 1){
				break;	//반복문 빠져나가는 break
			}
			*/
		}
		sc.close();
	}
	
}
