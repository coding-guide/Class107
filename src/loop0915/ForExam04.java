package loop0915;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			System.out.println("���� N�� �Է��ϼ���.(��,0�� ���α׷�������)>>>");
			int inputNum = in.nextInt();
			if(inputNum==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// �Է¹��� ���� N�� 2��� : n*2
			System.out.println("�Է¹��� ���� "+inputNum+"�� 2��� : " + inputNum*2);
		}//for
		in.close();
	}//main
}
