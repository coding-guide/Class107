package loop0915;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			System.out.println("정수 N을 입력하세요.(단,0은 프로그램종료임)>>>");
			int inputNum = in.nextInt();
			if(inputNum==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 입력받은 숫자 N의 2배수 : n*2
			System.out.println("입력받은 숫자 "+inputNum+"의 2배수 : " + inputNum*2);
		}//for
		in.close();
	}//main
}
