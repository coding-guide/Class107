package ifstatement;

public class IfExam04 {

	public static void main(String[] args) {
// g : ±Ýµµ³¢  s : Àºµµ³¢   b: ¼èµµ³¢  ±×¿Ü : µµ³¢°¡ ¾Æ´Õ´Ï´Ù.
//		8¿ù 31ÀÏ °úÁ¦ÀÓ. 
		char ch = 'b';
		if(ch=='g') {
			System.out.println("±Ýµµ³¢ÀÔ´Ï´Ù.");
		}else if(ch=='s') {
			System.out.println("Àºµµ³¢ÀÔ´Ï´Ù.");
		}else if(ch=='b') {
			System.out.println("¼èµµ³¢ÀÔ´Ï´Ù.");
		}else {
			System.out.println("µµ³¢°¡ ¾Æ´Õ´Ï´Ù.");
		}
	}

}
