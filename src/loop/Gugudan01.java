package loop;

import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���>>>");
		int dan = in.nextInt();
//  	1ū�� ���ϴ� ���		
//		int number = 10;
//		number = number + 1;
//		number += 1;
//		number++;
//		++number;

		System.out.println("====="+dan+"��=====");
		
		for(int num=1; num <=9; num++) {
			System.out.println(dan+" * "+num+" = "+dan*num);
		}

//		System.out.println(dan+" * 1 = " + dan*1);
	}

}
