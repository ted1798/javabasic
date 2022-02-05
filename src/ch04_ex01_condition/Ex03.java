package ch04_ex01_condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		//중첩 if문
		//id : java, pwd : abc123
		
		String id, pwd; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요: ");
		id = input.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id 일치");
 
			//pwd 확인
			pwd = input.nextLine();
		
			if (pwd.equals("abc123")) {
			System.out.println("로그인 성공");
			} else {
			System.out.println("비밀번호 불일치");
			}
		
		}
		else {
			System.out.println("id 불일치");
		}
	
		
		
	}

}
