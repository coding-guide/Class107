package ifstatement;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
//		28�ϱ���=>2
//		30�ϱ���=>4,6,9,11
//		31�ϱ���=>1,3,5,7,8,10,12
		Scanner in = new Scanner(System.in);
		System.out.println("���� �Է����ּ���.>>>");
		int month = in.nextInt();
//		�ҽ����Ĵ���Ű : Ctrl+Shift+F
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31���Դϴ�");
			break;
		case 2:
			System.out.println("28���Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30���Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

}
