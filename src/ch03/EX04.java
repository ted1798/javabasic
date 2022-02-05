package ch03;

public class EX04 {

	public static void main(String[] args) {
		// 비교 연산자 - 결과: T/F
		
		int a = 10;
		int b = 20;
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// 문자열 비교
		
		String str1 = "JAVA";
		String str2 = "java";
		System.out.println(str1 == str2);
		str2 = "JAVA";
		System.out.println(str1 == str2);
		

	}

}
