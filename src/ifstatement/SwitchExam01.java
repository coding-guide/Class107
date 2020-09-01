package ifstatement;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		//1=>금상, 2=>은상, 3=>동상, 그외=>수상하지 못했습니다.
		//상금 : 금상=>백만원, 은상=>오십만원,, 동상=>십만원,
		Scanner in = new Scanner(System.in);
		System.out.println("1,2,3,...숫자를 입력하세요.");
		int num = in.nextInt();
		int money=0;
		// if( num == 1){  }
		switch(num) {
			case 1:
				System.out.println("금상");
				money = 1000000;
				break;
			case 2:
				System.out.println("은상");
				money = 500000;
				break;
			case 3:
				System.out.println("동상");
				money = 100000;
				break;
			default:
				System.out.println("수상하지못했습니다.");
		}//switch
		System.out.println("상금은 "+money+"원 입니다.");

	}

}
