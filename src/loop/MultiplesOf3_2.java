package loop;

import java.util.Scanner;

public class MultiplesOf3_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���� n�� �Է��ϼ���>>>");
		int number = in.nextInt();
//		������¸� 
//		3�� ��� : 3 6 9 12 ....
//		�� ���� �� �ֵ��� �ڵ��ϼ���.
		System.out.print("3�� ��� : ");
		for(int cnt=1;cnt<=number;cnt++) {
			if(cnt % 3 == 0) {
				System.out.print(cnt+" ");
			}
		}
		
	}

}
