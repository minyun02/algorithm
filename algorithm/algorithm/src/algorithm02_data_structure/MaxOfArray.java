package algorithm02_data_structure;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// 배열의 최댓값을 구한다
		Scanner num = new Scanner(System.in);
		System.out.println("키의 최댓값을 구한다");
		System.out.println("사람 수= ");
		int ppl = num.nextInt();
		
		int[] height = new int[ppl];
		
		for(int i=0; i<ppl; i++) {
			System.out.println("height["+ i +"] = ");
			height[i] = num.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다!!");
	}

}
