package loop0922;

import java.util.Scanner;

public class ForExam07 {

	public static void main(String[] args) {
		// ����ڷκ��� ���� N�� �Է¹޾�, �Է� ������ ��������
		// ��Ȧ����, ��¦������ ����ϰ� 0�� �Է��ϸ� ���α׷��� �����Ͻÿ�.( break )

		Scanner in = new Scanner(System.in);

		System.out.println("¦��, Ȧ���� �Ǻ��ϴ� ���α׷��Դϴ�.");
		
		do {
			System.out.println("���� N�� �Է��ϼ���>>>>");
			int inputNumber = in.nextInt();
			if (inputNumber == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if (inputNumber % 2 == 0) {
				System.out.println(inputNumber + "�� ¦���Դϴ�.");
			} else {
				System.out.println(inputNumber + "�� Ȧ���Դϴ�.");
			}
		} while (true);
		
		in.close();
	}
}
