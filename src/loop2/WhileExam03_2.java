package loop2;

import java.util.Scanner;

public class WhileExam03_2 {

	public static void main(String[] args) {
// ���� : 0�� �Է��Ҷ����� �Էµ� ������ ����Ͻÿ�.
//		���ڸ� �Է��ϼ���>>>>>
//		3
//		�Էµȼ��� : 3
//		���ڸ� �Է��ϼ���>>>>>
//		0
//		�ݺ��� ����Ǿ����ϴ�.
		Scanner in = new Scanner(System.in);
		int number;
		do {
			System.out.println("���ڸ� �Է��ϼ���>>>>");
			number = in.nextInt();
			if(number==0) {
				break;
			}
			System.out.println("�Էµ� ����: "+number);
		}while(number != 0);
		
		
		System.out.println("�ݺ����� ����Ǿ����ϴ�.");

	}

}
