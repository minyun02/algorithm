package algorithm01;

import java.util.Scanner;

public class SignCheck {
	
	public static void main(String[] args) {
		// 입력값의 부호(양수/음수/0) 판단한다
		Scanner inputNum = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int a = inputNum.nextInt();
		
		if(a > 0) {
			System.out.println("입력값은 양수입니다.");
		}else if(a < 0) {
			System.out.println("입력값은 음수입니다.");
		}else {
			System.out.println("입력값은 0입니다.");
		}
	}

}
