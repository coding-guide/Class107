package loop0915;

import java.util.Scanner;

public class PrintUntilN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		for���� ���ѹݺ�
//		for(;;) {
//			
//		}

//		while���� ���ѹݺ�
//		while(true) {
//			
//		}

//		do while���� ���ѹݺ�
//		do {
//			
//		}while(true);

		while(true) {
			//�������
			System.out.println("���� N�� �Է��ϼ���>>>");
			int cnt = in.nextInt();
			if (cnt > 0) {
				System.out.println("---0���� ���� N������ �� �����ϱ�---");
				int zero = 0;
				do {
					System.out.print(zero + " ");
					zero++;
				} while (zero <= cnt);
				System.out.println();
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}//�������
			
		}
//		in.close();
	}//main
}
