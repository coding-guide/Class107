package loop;

import java.util.Scanner;

public class MultiplesOf3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>");
		int number = in.nextInt();
//		������¸� 
//		3�� ��� : 3 6 9 12 ....
//		�� ���� �� �ֵ��� �ڵ��ϼ���.
		for(int cnt=1;cnt<=number;cnt++) {
//			3�� ����� üũ, ���üũ�ϴ� ������ => ������������ %
			if(cnt % 3==0) {
				System.out.println(cnt+"�� 3�� ����Դϴ�.");
			}else {
				System.out.println(cnt+"�� 3�� ����� �ƴմϴ�.");
			}
			
		}
		
	}

}
