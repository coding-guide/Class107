package ifstatement;

import java.util.Scanner;

public class IfExam05 {

	public static void main(String[] args) {
// 월을 입력받아서 해당월의 마지막 날짜를 출력해주는 프로그램
// Scanner를 사용, 정수를 입력받아야 됨
//	1 ~ 12까지 입력. 1~12이외의 숫자를 입력했을때 처리
//		어떻게 처리할건지.. 고민한번 해보고 오기
//		28일까지=>2
//		30일까지=>4,6,9,11
//		31일까지=>1,3,5,7,8,10,12
		Scanner in = new Scanner(System.in);
		System.out.println("월을 입력하세요>>>");
		int month = in.nextInt();
		if(month==1) {
			System.out.println("31일입니다.");
		}else if(month==2) {
			System.out.println("28일입니다.");
		}else if(month==3) {
			System.out.println("31일입니다.");
		}else if(month==4) {
			System.out.println("30일입니다.");
		}else if(month==5) {
			System.out.println("31일입니다.");
		}else if(month==6) {
			System.out.println("30일입니다.");
		}else if(month==7) {
			System.out.println("");
		}else if(month==8) {
			System.out.println("31일입니다.");
		}else if(month==9) {
			System.out.println("30일입니다.");
		}else if(month==10) {
			System.out.println("31일입니다.");
		}else if(month==11) {
			System.out.println("30일입니다.");
		}else if(month==12) {
			System.out.println("31일입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}	

}
