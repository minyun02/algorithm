package algorithm01;

import java.util.Scanner;

//세 값의 중앙값을 구하는 과정 = quick sort
public class Median {
	static int median(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		// 3개의 값에서 중앙값 구하기!
		Scanner inputNum = new Scanner(System.in);
		
		System.out.println("중앙값을 구할 3개의 수를 입력하세요");
		System.out.println("a의 값 : ");
		int a = inputNum.nextInt();
		System.out.println("b의 값 : ");
		int b = inputNum.nextInt();
		System.out.println("c의 값 : ");
		int c = inputNum.nextInt();
		
		System.out.println("중앙값은 : " + median(a, b, c) + "이다!");
	}

}
