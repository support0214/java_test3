package ifelse01;

public class IfElse03 {

	public static void main(String[] args) {
		int score = 68;
		
		if(score >= 80)
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
		
		int num1 = 675;
		if(num1 >= 1000)
			System.out.println("1000보다 큰 숫자입니다");
		else
			System.out.println("1000보다 작은 수입니다");
		
		if(num1 % 2 == 0)
			System.out.println("짝수 입니다");
		else
			System.out.println("홀수 입니다");
	}
}
