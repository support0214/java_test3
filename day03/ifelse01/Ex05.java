package ifelse01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 사용자로 부터 숫자 1개를 입력받아
		// 0, 음수, 양수 출력
		// if ~ else문으로
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 넣으세요 : ");
		int num = sc.nextInt();
		
		if(num == 0)
			System.out.println("0입니다");
		else if(num < 0)
			System.out.println("음수입니다");
		else 
			System.out.println("양수입니다");
		*/
		
		int score = -12342340;
		if(score<0 || score>100)
			System.out.println("점수는 0~100사이 입니다. 다시 넣으세요");
		else if(score <= 100 && score >= 90)
			System.out.println("A학점");
		else if(score < 90 && score >= 80)
			System.out.println("B학점");
		else if(score < 80 && score >= 70)
			System.out.println("C학점");
		else if(score < 70 && score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
