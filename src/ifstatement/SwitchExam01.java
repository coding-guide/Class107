package ifstatement;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		//1=>�ݻ�, 2=>����, 3=>����, �׿�=>�������� ���߽��ϴ�.
		//��� : �ݻ�=>�鸸��, ����=>���ʸ���,, ����=>�ʸ���,
		Scanner in = new Scanner(System.in);
		System.out.println("1,2,3,...���ڸ� �Է��ϼ���.");
		int num = in.nextInt();
		int money=0;
		// if( num == 1){  }
		switch(num) {
			case 1:
				System.out.println("�ݻ�");
				money = 1000000;
				break;
			case 2:
				System.out.println("����");
				money = 500000;
				break;
			case 3:
				System.out.println("����");
				money = 100000;
				break;
			default:
				System.out.println("�����������߽��ϴ�.");
		}//switch
		System.out.println("����� "+money+"�� �Դϴ�.");

	}

}
