package algorithm01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// 1~n의 합을 구한다(양수만 입력가능)
		
		Scanner num = new Scanner(System.in);
		int n;
		
		System.out.println("1~n의 합을 구한다");
		
		do {
			System.out.println("n = ");
			n = num.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		
		for (int i=1; i <=n; i++) {
			sum += i;
		}
		System.out.println("1~"+n+"의 합은 = "+sum+"입니다");
	}

}
