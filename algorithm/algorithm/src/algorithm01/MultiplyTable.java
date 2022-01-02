package algorithm01;

public class MultiplyTable {

	public static void main(String[] args) {
		// 곱셈표 만들기
		System.out.println("*********곱셈표********");
		
		for(int i=2; i<=9; i++) {
			System.out.printf(i+"단 -> ");
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

}
