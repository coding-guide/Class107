package ifstatement;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
//		8�� �̸�  , 5000��
//		8~14�� �̸� , 10000��
//		14~20�� �̸� , 30000��
//		20�� �̻� , 50000��
		int money=0;
		Scanner in = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>>");
		int age = in.nextInt();
		
		if(age < 8) {
			System.out.println("������ �Դϴ�.");
			money = 5000;
		}else if(age < 14) {
			// 8 <= age < 14
			System.out.println("�ʵ��л� �Դϴ�.");
			money = 10000;
			
		}else if( age < 20 ) {
			// 14 <= age < 20
			System.out.println("�߰����Դϴ�.");
			money = 30000;
		}else { // age >= 20
			System.out.println("�����Դϴ�.");
			money=50000;
		}//if
		System.out.println("���� �뵷�� "+money+"�Դϴ�.");
	}

}
