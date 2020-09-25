package loop0922;

import java.util.Scanner;

public class ForExam07 {

	public static void main(String[] args) {
		// 사용자로부터 정수 N을 입력받아, 입력 받은은 수에따라
		// ‘홀수’, ‘짝수’를 출력하고 0을 입력하면 프로그램을 종료하시오.( break )

		Scanner in = new Scanner(System.in);

		System.out.println("짝수, 홀수를 판별하는 프로그램입니다.");
		
		do {
			System.out.println("정수 N을 입력하세요>>>>");
			int inputNumber = in.nextInt();
			if (inputNumber == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (inputNumber % 2 == 0) {
				System.out.println(inputNumber + "는 짝수입니다.");
			} else {
				System.out.println(inputNumber + "는 홀수입니다.");
			}
		} while (true);
		
		in.close();
	}
}
