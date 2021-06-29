package algorithm;

public class MaxNumber2 {
	
	static int maxNumOutofThree(int a, int b, int c) {
		int maxNum = a;
		if(b > maxNum) {
			maxNum = b;
		}
		if(c > maxNum) {
			maxNum = c;
		}
		
		return maxNum;
	}
	
	public static void main(String[] args) {
		// 여러 값에 대한 최댓값 구하기
		System.out.println("3,2,1 -> maxNum : " + maxNumOutofThree(3,2,1));
		System.out.println("4,1,5 -> maxNum : " + maxNumOutofThree(4,1,5));
		System.out.println("2,4,7 -> maxNum : " + maxNumOutofThree(2,4,7));
		System.out.println("4,8,1 -> maxNum : " + maxNumOutofThree(4,8,1));
	}

}
