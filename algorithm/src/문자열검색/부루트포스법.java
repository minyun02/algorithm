package 문자열검색;

import java.util.Scanner;

//브루트-포스법으로 문자열을 검색하는 프로그램
/*
 bfMatch는 txt에서 pat을 검색하여 텍스트의 위치(인덱스)를 반환합니다.
 여러 개가 있는 경우 가장 앞쪽에 위치한 텍스트의 인덱스를 반환
 검색에 실패하면 -1
 텍스트를 스캔하기 위한 변수로 pt를 사용
 패턴을 스캔하기 위한 변수로 pp를 사용
 * */
public class 부루트포스법 {
	//브루트-포스법으로 문자열을 검색하는 메서드
	static int bfMatch(String txt, String pat) {
		int pt = 0; //txt 커서
		int pp = 0; //pat 커서

		while (pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			}else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length()) {
			return pt - pp; // 검색 성공
		}
		return -1; //검색 실패
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("텍스트 : ");
		String s1 = stdIn.next(); //텍스트용 문자열
		
		System.out.println("패턴 : ");
		String s2 = stdIn.next(); //패턴용 문자열
		
		int idx = bfMatch(s1, s2);
		System.out.println(idx);
		if(idx == -1) {
			System.out.println("텍스트에 패턴이 없습니다.");
		}else {
			//일치하는 문자 바로 앞까지의 길이를 구합니다.
			int len = 0;
			for (int i = 0; i<idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			len += s2.length();
			
			System.out.println((idx + 1)+"번째 문자부터 일치합니다.");
			System.out.println("텍스트 : "+s1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
		}

	}

}

