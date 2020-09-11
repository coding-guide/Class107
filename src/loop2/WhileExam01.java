package loop2;

public class WhileExam01 {

	public static void main(String[] args) {
		// 1~ 10까지 출력하는 반복문
		// for(초기값;조건식;증감식)
		for(int i=1; i<=10;i++) {
			System.out.println("for반복문의 i값 : "+i);
		}
		
		// while문의 (조건식)안에는 조건식만 들어감
		int i = 1;
		while(i<=10) {//조건을 벗어나는 i값은? 11
			System.out.println("while반복문의 i값 : "+i);
			i++;
			//1번
		}
	}

}
