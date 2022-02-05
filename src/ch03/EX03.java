package ch03;

public class EX03 {

	public static void main(String[] args) {
		// 증감 연산자 - 반복문에서 자주 쓰임
		// 증감 연산자는 사용 유무가 중요함.
		// 변수 선언 시 처음에만 데이터 타입 써주기
		int x = 10;
		System.out.println(x++);
		System.out.println(x);

		x = 10;
		System.out.println(++x);
		System.out.println(x);

		
		//x++합계 구하기
		int sum;
		x=10;
		sum=x++ +10;
		System.out.println(x);
		System.out.println(sum);
		
		//++x 합계 구하기
		x = 10;
		sum = 0;
		sum = ++x + 10;
		System.out.println(x);
		System.out.println(sum);
		
		//디버그(변수의 진행상황을 알 수 있는 방법)
		
	}

}
