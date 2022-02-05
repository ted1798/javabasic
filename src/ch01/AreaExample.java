package ch01;

public class AreaExample {

	public static void main(String[] args) {
		int width = 3;
		int height = 4;
		
		//System.out.println("사각형의 넓이:" + width * height);
		System.out.println("사각형의 넓이:" + rectangle(width, height));
		System.out.println("삼각형의 넓이:" + triangle(width, height));
		
	}
	
	static int rectangle(int width, int height) {
		return width * height;
	}
	
	static int triangle(int width, int height) {
		return width * height/2;
	}
 
}
