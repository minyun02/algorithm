package algorithm02_data_structure;

public class IntArray {

	public static void main(String[] args) {
		// 구성 요소의 자료형이 int형인 배열(구성 요솟수는 5 : new에 의해 본체를 생성)
		int[] a = new int[5]; //배열 선언
		
		a[1] = 37; // a1에 37을 대입
		a[2] = 57;
		a[4] = a[1] * 2;    //a4에 a1 *, 74를 대입
		
		for(int i=0; i< a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
