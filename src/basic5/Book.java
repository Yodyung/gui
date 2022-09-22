package basic5;

public class Book {
	
	static String a;
	private static int count;		//객체끼리의 공유를 원하면 static
							//객체 생성보다도 먼저 실행하기 때문에 클래스명 접근이 가능하다.
							
	
	public Book() {
		count++;
	}
	
	public static int getCount() {		//static을 메소드 앞에 붙히면 같은 static 클래스 안에서 사용,접근 가능
		return count;
	}


}
