package switchCase02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 5칙연산(+,-,*,/,%)
		// 3개 (숫자로 2개, 문자 1개)를 입력받아
		// 연산자에 해당하는 연산을 수행하여 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연산할 첫번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("연산자 입력 : ");
		String oper = scan.next();
		char op = oper.charAt(0);
		
		System.out.println("연산할 두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		switch(op) {
		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + num1*num2);
			break;
		case '/':
			System.out.printf("%d/%d=%.2f", num1, num2,(double)num1/num2);
			break;
		case '%':
			System.out.println(num1 + "%" + num2 + "=" + num1%num2);
			break;
		}
	}
}
