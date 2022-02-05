package ch05;

public class ex1 {

	public static void main(String[] args) {
		int[] scores = new int[10];
		scores[0] = 30;
		scores[1] = 40;
		scores[2] = 50;
		scores[3] = 60;
		scores[4] = 70;
		
		// 점수의 합계와 평균 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
			// sum+= scores[i];
		}
		System.out.println(sum);
		System.out.println(sum/5);
	}

}
