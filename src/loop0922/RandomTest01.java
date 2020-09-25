package loop0922;

public class RandomTest01 {

	public static void main(String[] args) {
//		System.out.println("--Math.random()이 반환해주는 값--");
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(Math.random());
//		}
		// 0 <= Math.random의 범위 < 1
//		System.out.println("---- 0 ~ 99까지의 난수 반환 ----");
//		for (int i = 1; i <= 100; i++) {
//			// Math.random()*100   
//			System.out.println((int)(Math.random() * 100));
//		}
		// 1 ~ 100 까지의 임의의 정수를 출력하시오.
		for (int i = 1; i <= 22; i++) {
			// 1번 : 00점   2번 : 00점  22명까지 출력해보기  점수는 1 ~ 100점.   
			System.out.println(i+"번 : "+(int)(Math.random() * 100+1));
		}
	}

}
