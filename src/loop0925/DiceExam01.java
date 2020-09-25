package loop0925;

import java.util.Scanner;

public class DiceExam01 {

	public static void main(String[] args) {
		int jumsu = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("도전자 이름은????>>>>>");
		String name = in.next();
		for (int cnt = 1; cnt <= 5; cnt++) {
			System.out.println("-----"+cnt+"번째 주사위 게임-----");
			int diceNum = (int) (Math.random() * 6) + 1;
			for (int i = 3; i >= 1; i--) {
				System.out.println("주사위 눈값은?? 얼마???>>>>");
				int inputDiceNum = in.nextInt();
				if (diceNum == inputDiceNum) {
					System.out.println("정답입니다~");
					jumsu = jumsu+i * 10;//점수 누적하는 명령문
					break;
				} else {
					System.out.println("틀렸습니다~");
				}
			}
			System.out.println(jumsu + "점 입니다.");
		}
		System.out.println(name+"님 최종 점수는 "+jumsu+"입니다.");

	}

}
