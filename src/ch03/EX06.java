package ch03;

public class EX06 {

	public static void main(String[] args) {
		// 비트 연산자(이진수 체계에서의 연산)
		// 종류 : &, |, ^, ~
		int a = 15; // 이진수 = 1111(4byte)
		int b = 5; // 이진수 = 0101(4byte)
		
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);
		
		//비트 수프트 연산
		System.out.println(a>>2);
		//1111 > 0011|11(2번 밀어준다)
		System.out.println(b<<2);
		//0101 > 010100|
		
		
	}

}
