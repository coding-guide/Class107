package loop2;

public class WhileExam01 {

	public static void main(String[] args) {
		// 1~ 10���� ����ϴ� �ݺ���
		// for(�ʱⰪ;���ǽ�;������)
		for(int i=1; i<=10;i++) {
			System.out.println("for�ݺ����� i�� : "+i);
		}
		
		// while���� (���ǽ�)�ȿ��� ���ǽĸ� ��
		int i = 1;
		while(i<=10) {//������ ����� i����? 11
			System.out.println("while�ݺ����� i�� : "+i);
			i++;
			//1��
		}
	}

}
