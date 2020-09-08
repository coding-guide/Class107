package loop;

import java.util.Scanner;

public class MultiplesOf3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>");
		int number = in.nextInt();
//		출력형태를 
//		3의 배수 : 3 6 9 12 ....
//		로 나올 수 있도록 코딩하세요.
		for(int cnt=1;cnt<=number;cnt++) {
//			3의 배수를 체크, 배수체크하는 연산자 => 나머지연산자 %
			if(cnt % 3==0) {
				System.out.println(cnt+"는 3의 배수입니다.");
			}else {
				System.out.println(cnt+"는 3의 배수가 아닙니다.");
			}
			
		}
		
	}

}
