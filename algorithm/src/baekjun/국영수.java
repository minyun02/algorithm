package baekjun;

import java.util.Arrays;
import java.util.Comparator;


public class 국영수 {
	static String[][] arr = {
						{"Junkyu", "50", "60", "100"},
						{"Sangkeun", "80", "60", "50"},
						{"Sunyoung", "80", "70", "100"},
						{"Soong", "50", "60", "90"},
						{"Haebin", "50", "60", "100"},
						{"Kangsoo", "60", "80", "100"},
						{"Donghyuk", "80", "60", "100"},
						{"Sei", "70", "70", "70"},
						{"Wonseob", "70", "70", "90"},
						{"Sanghyun", "70", "70", "80"},
						{"nsj", "80", "80", "80"},
						{"Taewhan", "50", "60", "90"},
					};
	
	public static void main(String[] args) {
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
//				System.out.println("o1===>"+Arrays.toString(o1));
//				System.out.println("o2===>"+Arrays.toString(o2));
				int a = Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
				if(a > 0) {
					return -1;
				}else if(a==0) {
					int b = Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
					if(b < 0) {
						return -1;
					}else if(b == 0) {
						int c = Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
						if(c > 0) {
							return -1;
						}else if(c == 0) {
							return o1[0].compareTo(o2[0]);
						}
					}
				}
				return 1;
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"==>"+arr[i][0]);
		}
		
	}

}
