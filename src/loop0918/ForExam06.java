package loop0918;

import java.util.Scanner;

public class ForExam06 {

	public static void main(String[] args) {
//  ����ڰ� ���� N�� �Է��ϸ� N���� 2�� ����� ������ ���� ���Ͻÿ�.
		Scanner in = new Scanner(System.in);
		System.out.println("���� N�� �Է��ϼ���.(�� 0�� ����)>>>");
		int inputNum = in.nextInt();
		int nCnt = 0;
		int nSum = 0;
		System.out.println("======="+inputNum+"���� 2�� ��� �Դϴ�.=======");
		for(int i = 1; i<=inputNum; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
				nCnt = nCnt + 1; // nCnt += 1; nCnt++; 
				nSum = nSum + i;
			}
		}//for
		System.out.println();//����
		System.out.println("2�� ����� ���� : "+nCnt);
		System.out.println(inputNum+"���� 2�� ����� �� : "+nSum);
		
	}

}
