package loop0918;

import java.util.Scanner;

public class ForExam06 {

	public static void main(String[] args) {
//  사용자가 정수 N을 입력하면 N까지 2의 배수의 개수와 합을 구하시오.
		Scanner in = new Scanner(System.in);
		System.out.println("정수 N을 입력하세요.(단 0은 종료)>>>");
		int inputNum = in.nextInt();
		int nCnt = 0;
		int nSum = 0;
		System.out.println("======="+inputNum+"까지 2의 배수 입니다.=======");
		for(int i = 1; i<=inputNum; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
				nCnt = nCnt + 1; // nCnt += 1; nCnt++; 
				nSum = nSum + i;
			}
		}//for
		System.out.println();//빈줄
		System.out.println("2의 배수의 개수 : "+nCnt);
		System.out.println(inputNum+"까지 2의 배수의 합 : "+nSum);
		
	}

}
