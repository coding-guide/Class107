package loop;

import java.util.Scanner;

public class CountN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���>>>");
		int number = in.nextInt();
		
		for(int j=1; j<=10;j++) {
			for(int i=1; i<=number; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
