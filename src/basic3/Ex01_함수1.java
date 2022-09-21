package basic3;

public class Ex01_함수1 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		add(a,b);
	}

	static void add(int a, int b) {		//()괄호 안의 값을 파라메타(인자) 라고 부름
		//a, b 값을 합해서 출력
		int sum=a+b;
		System.out.println("합 : "+sum);
		
		
		
	}
}
