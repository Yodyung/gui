package basic3;

public class Ex03_CallByValue {
	//보내는 함수 인자의 자료형이 기본형인 경우를 말한다.
	//stack 영역에 생성되어서 지역변수처럼 쓰여지다가 다시 돌아오면 사라진다.

	public static void main(String[] args) {
		int a=10, b=20;
		add(a,b);
		System.out.println("A="+a+" B="+b); 		//2번으로 실행 10,20
		

	}

	static void add(int a, int b) {
		a+=b;
		System.out.println("A="+a+" B="+b);		//1번으로 실행 30,20
	}
}
