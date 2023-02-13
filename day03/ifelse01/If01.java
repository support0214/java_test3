package ifelse01;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// if(조건식) { 조건이 참일 때에만 실행할 구문 }
		int score = 93;
		
		if(score>=80) {
			System.out.println("합격입니다");
		}
		System.out.println("----------------");
		
		if(score < 60) { 
			System.out.println("재평가 대상입니다");
		}
		System.out.println("----------------");
		
		if(score >= 90) {
			System.out.println("합격입니다");
			System.out.println("우수한 성적입니다");
		}
		System.out.println("================");
		
		int num = 0;
		if(num == 0)
			System.out.println("0입니다");
		
		if(num > 0) { 
			System.out.println("양수입니다");
			System.out.println("0보다 큰 수입니다");
		}
		if(num < 0) {
			System.out.println("음수입니다");
			System.out.println("0보다 작은 수입니다");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		int num2 = scan.nextInt();
		
		if(num2 % 2 == 0)
			System.out.println("짝수");
		if(num2 % 2 == 1)
			System.out.println("홀수");
		
		
		
		
		
		
		
		
		
		
	}
}
