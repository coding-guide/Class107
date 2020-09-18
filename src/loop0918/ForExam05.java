package loop0918;

import java.util.Scanner;

public class ForExam05 {

	public static void main(String[] args) {
		// 입력받은 수까지 나열하되 3의 배수는 제외
		Scanner in = new Scanner(System.in);
		System.out.println("정수 N을 입력하세요>>>");
		int inputNum = in.nextInt();
		for(int i = 1; i<=inputNum;i++) {
			if(i % 3 == 0) {
				System.out.print("짝  ");
				continue;
			}
			System.out.print(i+" ");
		}
		
		in.close();
		
	}

}
