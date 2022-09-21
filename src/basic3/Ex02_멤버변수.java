package basic3;

public class Ex02_멤버변수 {

	static int a=10, b=20;		//클래스 내의 모든 메소드에서 다 사용할 수 있다.
	static int sum=0;
	
	public static void main(String[] args) {
		
		add();
		//두 수를 더한 결과를 출력
		System.out.println("합 : "+sum);
	}

	static void add() {
		//두 수를 더하기
		sum=a+b;
		
	}
}
