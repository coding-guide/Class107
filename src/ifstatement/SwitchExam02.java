package ifstatement;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
//		28일까지=>2
//		30일까지=>4,6,9,11
//		31일까지=>1,3,5,7,8,10,12
		Scanner in = new Scanner(System.in);
		System.out.println("월을 입력해주세요.>>>");
		int month = in.nextInt();
//		소스정렬단축키 : Ctrl+Shift+F
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
