package ifelse01;

public class IfElse04 {

	public static void main(String[] args) {
		int score = 34;
		
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		int month = 8;
		if(month>=3 && month<=5)
			System.out.println("봄입니다");
		else if(month>=6 && month<=8)
			System.out.println("여름입니다"); // 35도 이상이면 폭염경보, 40도이상이면 폭염주의보
		else if(month>=9 && month<=11)
			System.out.println("가을입니다");
		else if(month==1 || month==2 || month==12)
			System.out.println("겨울입니다"); // -10도 이하이면 한파경보, -20도이하이면 한파주의보
		else
			System.out.println("1~12달만 존재합니다 다시 넣으세요");

	}

}
