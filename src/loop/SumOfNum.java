package loop;

public class SumOfNum {

	public static void main(String[] args) {
		//  1���� N������ ���� ���Ͻÿ�.
//		1+2+3+4+5
//		1, 1+2, 1+2+3, 1+2+3+4, 1+2+3+4+5
		int sum=0;
		for(int i = 1; i <= 9999;i++) {
			sum = sum + i;
		}
		System.out.println("9999������ ���� : "+sum);

	}

}
