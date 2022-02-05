package ch03;

public class Verify01 {

	public static void main(String[] args) {
	
		
		/* 
		 * quiz01
		 * 아래 코드를 완성하세요.
		 *  */
		 
		int pencils = 534;
		int students = 30;
		
		// 학생1명이 가지는 연필 개수 
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		// 학생들에게 골고루 나눠 주고 난 후 남은 연필 개수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);

		
		/*
		 * quiz02
		 */ //원하는 결과 : 5
		
		int var1 = 5;
		int var2 = 2;
		double var3 = ((double)var1 / var2);
		int var4 = (int)(var3 * var2);
		System.out.println(var4);

		 
		
		
		/*
		 * quiz04
		 * 삼항 연산자를 이용하여 점수가 90점 이상이면 '우수', 미만이면 '보통'을 출력하세요.
		 * 
		 */
		int score = 85;
		String result = score >=90 ? "우수" : "보통";
		System.out.println(result);

		
	}

}
