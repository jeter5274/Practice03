package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
	
		int answer=29, num=0;
		Scanner sc = new Scanner(System.in);
		
		//answer = (int)(Math.random() * 100 + 1);	//1~100 난수 생성
		
		while(true) {
			
			if(num==0) {
				
				System.out.println("==============================");
				System.out.println("    [숫자맞추기게임 시작]");
				System.out.println("==============================");
				System.out.print(">>");
				num = sc.nextInt();		
				
			}else if(num == answer) {
				
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				char endgame = sc.next().charAt(0); //charAt(0)는 스트링의 0번째 문자라는 의미
				
				if(endgame == 'y' ) { //endgame.equal("y");로 스트링 비교 가능
					System.out.println("==============================");
					System.out.println("    [숫자맞추기게임 종료]");
					System.out.println("==============================");
					break;
					
				}else if(endgame == 'n' ) {
					
					num = 0;	//num이 초기화 안되면 이미 29가 입력된 상태이므로 문제를 다시 풀 수 없음
					//answer = (int)(Math.random() * 100 + 1);	//난수 재생성
					continue;
					
				}else {
					
					System.out.println("잘 못 입력하셨습니다. 게임을 종료합니다.\n");
					System.out.println("==============================");
					System.out.println("    [숫자맞추기게임 종료]");
					System.out.println("==============================");
					break;
				}
					
			}else if(num > answer) {
				
				System.out.println("더 낮게");
				System.out.print(">>");
				num = sc.nextInt();
				
			}else {
				
				System.out.println("더 높게");
				System.out.print(">>");
				num = sc.nextInt();
				
			}
		}
		sc.close();
	}

}
