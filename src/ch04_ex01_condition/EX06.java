package ch04_ex01_condition;

public class EX06 {

	public static void main(String[] args) {
		// 반복문을 이용해서 홀수만 출력하기
		
		for (int i=1; i<=10; i++) {
			
			if (i%2==1) {
			System.out.println(i);
			}else {
				continue;
			}
		}
		
	}
	
}
	
	
