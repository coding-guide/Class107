package ifstatement;

import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {
//1=>�ݻ�, 2=>����, 3=>����, �׿�=>�������� ���߽��ϴ�.
//��� : �ݻ�=>�鸸��, ����=>���ʸ���,, ����=>�ʸ���,
		Scanner in = new Scanner(System.in);
		System.out.println("1,2,3,...���ڸ� �Է��ϼ���>>>");
		int num = in.nextInt();
		int money=0;
		if(num==1) {
			System.out.println("�ݻ�");
			money = 1000000;
		}else if(num==2) {
			System.out.println("����");
			money=500000;
		}else if(num==3) {
			System.out.println("����");
			money=100000;
		}else {
			System.out.println("�������� ���߽��ϴ�.");
		}//if~elseif
		System.out.println("����� "+money+"���Դϴ�.");
		
	}//main()

}//class
