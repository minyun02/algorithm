package algorithm01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// for문으로 정수 합계구하기
		Scanner num = new Scanner(System.in);
		
		System.out.println("1~n의 합을 구한다");
		System.out.println("n = ");
		int n = num.nextInt();
		
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1~"+n+"의 합은 = "+ sum);
	}

}
