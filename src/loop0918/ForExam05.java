package loop0918;

import java.util.Scanner;

public class ForExam05 {

	public static void main(String[] args) {
		// �Է¹��� ������ �����ϵ� 3�� ����� ����
		Scanner in = new Scanner(System.in);
		System.out.println("���� N�� �Է��ϼ���>>>");
		int inputNum = in.nextInt();
		for(int i = 1; i<=inputNum;i++) {
			if(i % 3 == 0) {
				System.out.print("¦  ");
				continue;
			}
			System.out.print(i+" ");
		}
		
		in.close();
		
	}

}
