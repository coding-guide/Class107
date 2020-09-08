package loop;

import java.util.Scanner;

public class SumOfNum02 {

	public static void main(String[] args) {
//		9월 4일 과제
//		키보드로 정수를 입력받아(N) 입력받은 수까지의 합을 구하시오.
//		반복문으로 처리
//		출력형태 : 입력받은수 N까지의 합 : 0000
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>>");
		int number = in.nextInt();
		
		int sum = 0;
		for(int cnt=1;cnt<=number;cnt++) {
			sum = sum + cnt;
//			number가 5인경우의 반복문의 실행 모습
//			cnt 1: 1 <== 0 + 1
//			cnt 2: 3 <== 1 + 2
//			cnt 3: 6 <== 3 + 3
//			cnt 4 :10 <== 6 + 4
//			cnt 5 : 15 <== 10 + 5
//			cnt 6 : cnt<=number 조건이 false가 됨.
//			for문의 실행을 마침
		}
		System.out.println(number+"까지의 합 : "+sum);
	}

}
