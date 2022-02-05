package ch04_ex01_condition;

public class Verify01 {

	public static void main(String[] args) {
		//중첩 for문을 이용한 구구단 출력하기
		
		int j = 2;
		int k = 1;
		for (j=2; j<=9; j++) {
			System.out.println(j + "단");
			for (k=1; k<=5; k++) {
				System.out.println(j + "x" + k + "=" + j*k);
			}
			
			
			
		}

	}

}
