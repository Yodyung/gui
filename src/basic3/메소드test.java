package basic3;

public class 메소드test {

	public static void main(String[] args) {
		/*
(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
함수명 : checkLower
인자 : char
리턴(반환) : boolean

(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
함수명 : checkUpper
인자 : char
리턴(반환) : char		 
		 */

		boolean a=checklower('a');
		boolean b=checklower('A');
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		char aa=checkupper('Z');
		char bb=checkupper('d');
		System.out.println(aa);
		System.out.println(bb);
		
		
	}

	static boolean checklower(char a) {
		boolean b=false;
		if(Character.isLowerCase(a)) b=true;
		else b=false;
		return b;
	}
	
	static char checkupper(char a) {
		if(Character.isLowerCase(a)) a=Character.toUpperCase(a);
		return a;
	}
}
