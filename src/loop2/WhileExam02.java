package loop2;

public class WhileExam02 {

	public static void main(String[] args) {
		// 1+2+3+4+...+9+10�� ���� while������ �ۼ��Ͻÿ�.
		int cnt=1;
		int sum=0;
		while(cnt <= 10) {//11�� �Ǵ� ���� while�� ����
			sum = sum + cnt;
			cnt++;
		}
		System.out.println("1~10������ ��:"+sum);
		
	}

}
