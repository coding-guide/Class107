package loop;

import java.util.Scanner;

public class MultiplesOf3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 n을 입력하세요>>>");
		int number = in.nextInt();
//		출력형태를 
//		3의 배수 : 3 6 9 12 ....
//		로 나올 수 있도록 코딩하세요.
		System.out.print("3의 배수 : ");
		for(int cnt=1;cnt<=number;cnt++) {
			if(cnt % 3 == 0) {
				System.out.print(cnt+" ");
			}
		}
		
	}

}
