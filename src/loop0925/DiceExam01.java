package loop0925;

import java.util.Scanner;

public class DiceExam01 {

	public static void main(String[] args) {
		int jumsu = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������ �̸���????>>>>>");
		String name = in.next();
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("-----"+cnt+"��° �ֻ��� ����-----");
			int diceNum = (int) (Math.random() * 6) + 1;
			for (int i = 3; i >= 1; i--) {
				System.out.println("�ֻ��� ������?? ��???>>>>");
				int inputDiceNum = in.nextInt();
				if (diceNum == inputDiceNum) {
					System.out.println("�����Դϴ�~");
					jumsu = jumsu+i * 10;//���� �����ϴ� ��ɹ�
					break;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�~");
				}
			}
			System.out.println(jumsu + "�� �Դϴ�.");
		}
		System.out.println(name+"�� ���� ������ "+jumsu+"�Դϴ�.");

	}

}
