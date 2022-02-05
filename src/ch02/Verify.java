package ch02;

public class Verify {

	public static void main(String[] args) {
		// quiz01
		// 변수를 사용하려면 초기화해야 한다.
		int sum;
		int score1=0;
		int score2=0;
		sum = score1 + score2;

		
		//quiz02(형변환에서 대부분은 int)
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
		short result = (short)(s1 + s2);
		int result1 = i1 + i2;
		
		//quiz3(형변환 형태 확인)
		//알파벳의 a의 유니코드는 97, b의 유니코드는 98
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		//quiz4
		int x = 5;
		int y = 2;
		double result3 = (double)(x/y);
		System.out.println(result3);
		
		
				
	}

}
