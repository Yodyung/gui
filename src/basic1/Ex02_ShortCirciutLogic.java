package basic1;

public class Ex02_ShortCirciutLogic {

	public static void main(String[] args) {
		int a =3;
		
		//조건을 둘 다 만족해야 한다면 && 연산자, 하나만 만족해도 된다면 || 연산자 사용
		if(a>3 && ++a>3) {
			System.out.println("조건만족");
		}
		System.out.println("a="+a);
		//앞의 논리가 FALSE이므로 뒤의 연산이 돌아가지 않는다. (숏서킷)
		
		
		if(a>1||++a>3) {
			System.out.println("조건만족2");
		}
		System.out.println("a="+a);
		//앞의 논리가 true이므로 계산할 필요가 없어져 뒤의 연산이 돌아가지 않는다. (숏서킷)

	}

}
