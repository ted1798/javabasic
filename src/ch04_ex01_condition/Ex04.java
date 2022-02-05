package ch04_ex01_condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// switch case문(결과가 문자열이나 정수일때)
		// a,A : 우수회원
		// b,B : 일반회원
		// 나머지 : 손님
		
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		//grade라는 변수로 먼저 입력받기
				
		switch(grade) {
		case "a":
			System.out.println("우수 회원입니다.");
			break;
		case "A":
			System.out.println("우수 회원입니다.");
			break;
		case "b":
			System.out.println("일반 회원입니다.");
			break;
		case "B":
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		

	}

}
