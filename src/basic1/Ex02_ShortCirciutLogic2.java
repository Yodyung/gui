package basic1;

public class Ex02_ShortCirciutLogic2 {

	public static void main(String[] args) {
		int a =3;
		
		//조건을 둘 다 만족해야 한다면 & 연산자, 하나만 만족해도 된다면 | 연산자 사용
		if(a>3 & ++a>3) {
			System.out.println("조건만족");
		}
		System.out.println("a="+a);
		//한개짜리 연산자는 숏서킷이 발동되지 않으므로 뒤의 조건식까지 돌아감. 증감식이 작동하기 때문에 값이 4로 변동
		
		
		if(a>1|++a>3) {
			System.out.println("조건만족2");
		}
		System.out.println("a="+a);
		//한개짜리 연산자는 숏서킷이 발동되지 않으므로 뒤의 조건식까지 돌아감. 증감식이 작동하기 때문에 값이 4로 변동

	}

}
