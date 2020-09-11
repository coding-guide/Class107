package loop2;

public class WhileExam04 {

	public static void main(String[] args) {
		// 1~ 100 2의 배수만 출력하세요. while
		int cnt = 1;
		while(cnt <= 100) {
			if(cnt % 2 == 0) {
				System.out.println(cnt+"는 2의 배수 입니다.");
			}
			cnt++;
		}
	}

}
