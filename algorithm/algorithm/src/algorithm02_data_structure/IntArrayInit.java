package algorithm02_data_structure;

public class IntArrayInit {

	public static void main(String[] args) {
		// 구성 자료형이 int형인 배열
		int[] a = {1,2,3,4,5};
		int[] b = new int[] {1,2,3,4,5};
		
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+ i +"] = " + a[i]);
			System.out.println("b["+ i +"] ===== " + b[i]);
		}
	}

}
