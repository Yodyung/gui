package basic1;

public class Ex01_Var {	//extends Object{
	// *멤버 변수
	/*
	 자료형(data type)
	 1. 기본형
	 	Boolean
	 	char
	 	int/long
	 	double
	 
	 2. 참조형
	 	클래스
	 	배열
	 	--> new 예약어를 통해 객체를 생성
	 
	 (*)String 별종이라고 생각하기 따로 생각!
	 
	 
	 */

	public static void main(String[] args) {
		// *지역 변수
		String a;
		int b;
		
		b=200;
		a="Hello";
		// ***** 
		//a = new String("Hello"); 원래 이렇게 써야함 자바에서 알아서 축약 시켜줬기 때문에 위처럼 써도 되는거임
		//객체, 배열 무조건 stack heap 메모리 둘 다 씀. 기본 자료형은 stack 에 저장됨.
		
		System.out.println(a);
		System.out.println(b);
	

	}

}
