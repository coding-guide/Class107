package loop;

import java.util.Scanner;

public class SumOfNum02 {

	public static void main(String[] args) {
//		9�� 4�� ����
//		Ű����� ������ �Է¹޾�(N) �Է¹��� �������� ���� ���Ͻÿ�.
//		�ݺ������� ó��
//		������� : �Է¹����� N������ �� : 0000
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>>");
		int number = in.nextInt();
		
		int sum = 0;
		for(int cnt=1;cnt<=number;cnt++) {
			sum = sum + cnt;
//			number�� 5�ΰ���� �ݺ����� ���� ���
//			cnt 1: 1 <== 0 + 1
//			cnt 2: 3 <== 1 + 2
//			cnt 3: 6 <== 3 + 3
//			cnt 4 :10 <== 6 + 4
//			cnt 5 : 15 <== 10 + 5
//			cnt 6 : cnt<=number ������ false�� ��.
//			for���� ������ ��ħ
		}
		System.out.println(number+"������ �� : "+sum);
	}

}
