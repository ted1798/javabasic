package ch04_ex01_condition;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
	//if else문
	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
	//20이상 : 성인, 13초과 : 청소년, 8초과: 어린이, 나머지: 유아
	if(age >= 20) {
		System.out.println("성인입니다.");
	} else if(age>13) {
		System.out.println("청소년입니다.");
	} else if(age>8) {
		System.out.println("어린이입니다.");
	} else {
		System.out.println("유아입니다.");
	}
	
	System.out.println("결제를 진행해 주세요.");

	}

}
