package loop0922;

public class RandomTest01 {

	public static void main(String[] args) {
//		System.out.println("--Math.random()�� ��ȯ���ִ� ��--");
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(Math.random());
//		}
		// 0 <= Math.random�� ���� < 1
//		System.out.println("---- 0 ~ 99������ ���� ��ȯ ----");
//		for (int i = 1; i <= 100; i++) {
//			// Math.random()*100   
//			System.out.println((int)(Math.random() * 100));
//		}
		// 1 ~ 100 ������ ������ ������ ����Ͻÿ�.
		for (int i = 1; i <= 22; i++) {
			// 1�� : 00��   2�� : 00��  22����� ����غ���  ������ 1 ~ 100��.   
			System.out.println(i+"�� : "+(int)(Math.random() * 100+1));
		}
	}

}
