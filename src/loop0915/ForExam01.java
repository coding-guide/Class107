package loop0915;

public class ForExam01 {

	public static void main(String[] args) {
		// 1) 1 ~ 10���� ����Ͻÿ�.
		for(int i = 1; i <=10;i++) {
			System.out.println("���� :"+i);
		}
		
		// 11~ 20���� ��� while
		int cnt=11;
		while(cnt<=20) {
			System.out.println("���� :"+cnt++);
//			cnt++; ����ȵ�
		}
		
//		do {
//			
//		}while(����);
		
		// 21 ~ 30���� ���
		int num = 21;
		do {
			System.out.println("���� : "+num++);
		}while(num<=30);
	}

}
