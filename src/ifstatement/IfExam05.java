package ifstatement;

import java.util.Scanner;

public class IfExam05 {

	public static void main(String[] args) {
// ���� �Է¹޾Ƽ� �ش���� ������ ��¥�� ������ִ� ���α׷�
// Scanner�� ���, ������ �Է¹޾ƾ� ��
//	1 ~ 12���� �Է�. 1~12�̿��� ���ڸ� �Է������� ó��
//		��� ó���Ұ���.. ����ѹ� �غ��� ����
//		28�ϱ���=>2
//		30�ϱ���=>4,6,9,11
//		31�ϱ���=>1,3,5,7,8,10,12
		Scanner in = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���>>>");
		int month = in.nextInt();
		if(month==1) {
			System.out.println("31���Դϴ�.");
		}else if(month==2) {
			System.out.println("28���Դϴ�.");
		}else if(month==3) {
			System.out.println("31���Դϴ�.");
		}else if(month==4) {
			System.out.println("30���Դϴ�.");
		}else if(month==5) {
			System.out.println("31���Դϴ�.");
		}else if(month==6) {
			System.out.println("30���Դϴ�.");
		}else if(month==7) {
			System.out.println("");
		}else if(month==8) {
			System.out.println("31���Դϴ�.");
		}else if(month==9) {
			System.out.println("30���Դϴ�.");
		}else if(month==10) {
			System.out.println("31���Դϴ�.");
		}else if(month==11) {
			System.out.println("30���Դϴ�.");
		}else if(month==12) {
			System.out.println("31���Դϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	}	

}
