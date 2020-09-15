package loop0915;

public class ForExam01 {

	public static void main(String[] args) {
		// 1) 1 ~ 10까지 출력하시오.
		for(int i = 1; i <=10;i++) {
			System.out.println("숫자 :"+i);
		}
		
		// 11~ 20까지 출력 while
		int cnt=11;
		while(cnt<=20) {
			System.out.println("숫자 :"+cnt++);
//			cnt++; 실행안됨
		}
		
//		do {
//			
//		}while(조건);
		
		// 21 ~ 30까지 출력
		int num = 21;
		do {
			System.out.println("숫자 : "+num++);
		}while(num<=30);
	}

}
