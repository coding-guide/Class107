package loop2;

import java.util.Scanner;

public class WhileExam03_2 {

	public static void main(String[] args) {
// 문제 : 0을 입력할때까지 입력된 정수를 출력하시오.
//		숫자를 입력하세요>>>>>
//		3
//		입력된숫자 : 3
//		숫자를 입력하세요>>>>>
//		0
//		반복이 종료되었습니다.
		Scanner in = new Scanner(System.in);
		int number;
		do {
			System.out.println("숫자를 입력하세요>>>>");
			number = in.nextInt();
			if(number==0) {
				break;
			}
			System.out.println("입력된 숫자: "+number);
		}while(number != 0);
		
		
		System.out.println("반복문이 종료되었습니다.");

	}

}
