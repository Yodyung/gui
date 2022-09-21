package basic3;

public class Ex01_함수2 {

	public static void main(String[] args) {
		
		int sum=add();		//변수 sum은 add함수의 sum을 그대로 받는 변수
		System.out.println("합은 : "+sum);	//main메소드에 있는 sum의 출력값
		
		//합을 여기에서 출력해야함

	}

	static int add() {		//int값을 반환하는 메소드, static 메인 메소드에 반환하려면 static을 맞춰줘야 한다.
		int a=10, b=20;		//변수 설정
		int sum=a+b;		//변수 값을 더한 합 변수 설정
		return sum;			//반환할 변수 1가지 설정
	}
}
