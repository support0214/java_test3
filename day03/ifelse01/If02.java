package ifelse01;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 영문자(대소문자중 1개) 혹은 숫자(0~9 중 1개)를 입력받아
		// 영문자이면 문자입니다
		// 숫자이면 숫자입니다
		// 논리연산자로
		Scanner s = new Scanner(System.in);
		System.out.println("영문자(대소문자중 1개) 혹은 숫자(0~9 중 1개) 입력 : ");
		String str = s.next();
		char ch = str.charAt(0);
			
		if('0' <= ch && '9' >= ch)
			System.out.println("첫번째 넣은 값은 숫자입니다");
		
		if(('a'<=ch && 'z'>=ch) || ('A'<=ch && 'Z'>=ch))
			System.out.println("첫번째 넣은 값은 문자입니다");	
	}
}
