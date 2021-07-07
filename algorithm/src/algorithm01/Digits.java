package algorithm01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// 2자리 양수입력 받기
		Scanner num = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 양수를 입력하세요");
		
		do {
			System.out.println("입력 = ");
			no = num.nextInt();
//		}while (no < 10 || no > 90);
		}while (!(no >= 10 && no <= 99));
		
		System.out.println("변수 no의 값은"+no+"가(이) 되었습니다");
	}

}
