package access;

import accother.Access;

public class MainTest extends Access {		//extends Access // 상속 받기

	public static void main(String[] args) {
		
		MainTest acc=new MainTest();	//상속받은 클래스로 받아주어야 프로텍티드 접근 가능.
		//acc.a="프라이빗 변경";	//그 클래스 안에서만 접근 가능
		acc.b="퍼블릭 변경";		//전부 다 가능
		acc.c="프로텍티드 변경";	//메소드가 포함된 클래스에서 상속을 받았기 때문에 접근 가능
		//acc.d="디폴트 변경";		//해당 패키지 안에서만 접근 가능
		acc.output();

	}

}
