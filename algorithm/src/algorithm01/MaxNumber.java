package algorithm01;


import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		
		System.out.println("3개의 값에서 최대값을 찾습니다.");
		//비교할 첫번째 값을 스캐너로 입력받는다.
		System.out.println("값 1 : ");
		int a = inputNum.nextInt();
		
		//비교할 두번째 값을 스캐너로 입력받는다.
		System.out.println("값 2 : ");
		int b = inputNum.nextInt();
		
		//비교할 세번째 값을 스캐너로 입력받는다.
		System.out.println("값 3 : ");
		int c = inputNum.nextInt();
		
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		System.out.println("최대값은 "+max+"입니다!!!!");
	}
}
