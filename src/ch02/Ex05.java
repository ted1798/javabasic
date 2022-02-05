package ch02;

public class Ex05 {

	public static void main(String[] args) {
		// 형변환
		
		byte b = 12;
		int i = 126;
		
		// 자동 형변환(byte => int)
		i = b;
		i = (int)b;
		
		
		// 명시적 형변환(int => byte)
		b = (byte)i;
		
		System.out.println(b);
		
		
	}

}
