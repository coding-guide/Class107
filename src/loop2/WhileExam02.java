package loop2;

public class WhileExam02 {

	public static void main(String[] args) {
		// 1+2+3+4+...+9+10의 합을 while문으로 작성하시오.
		int cnt=1;
		int sum=0;
		while(cnt <= 10) {//11이 되는 순간 while문 종료
			sum = sum + cnt;
			cnt++;
		}
		System.out.println("1~10까지의 합:"+sum);
		
	}

}
