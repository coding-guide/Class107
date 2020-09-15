package loop0915;

import java.util.Scanner;

public class PrintUntilN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		for문의 무한반복
//		for(;;) {
//			
//		}

//		while문의 무한반복
//		while(true) {
//			
//		}

//		do while문의 무한반복
//		do {
//			
//		}while(true);

		while(true) {
			//여기부터
			System.out.println("숫자 N을 입력하세요>>>");
			int cnt = in.nextInt();
			if (cnt > 0) {
				System.out.println("---0부터 숫자 N까지의 수 나열하기---");
				int zero = 0;
				do {
					System.out.print(zero + " ");
					zero++;
				} while (zero <= cnt);
				System.out.println();
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//여기까지
			
		}
//		in.close();
	}//main
}
