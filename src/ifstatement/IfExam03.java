package ifstatement;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
//		8살 미만  , 5000원
//		8~14살 미만 , 10000원
//		14~20살 미만 , 30000원
//		20살 이상 , 50000원
		int money=0;
		Scanner in = new Scanner(System.in);
		System.out.println("나이를 입력하세요>>>");
		int age = in.nextInt();
		
		if(age < 8) {
			System.out.println("취학전 입니다.");
			money = 5000;
		}else if(age < 14) {
			// 8 <= age < 14
			System.out.println("초등학생 입니다.");
			money = 10000;
			
		}else if( age < 20 ) {
			// 14 <= age < 20
			System.out.println("중고등생입니다.");
			money = 30000;
		}else { // age >= 20
			System.out.println("성인입니다.");
			money=50000;
		}//if
		System.out.println("저의 용돈은 "+money+"입니다.");
	}

}
