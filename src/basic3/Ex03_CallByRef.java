package basic3;

public class Ex03_CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a=new StringBuffer("앙녕");
		StringBuffer b=new StringBuffer("하이");

		add(a,b);
		//a,b 는 값이 아니라 a,b값이 저장되어 있는 heap 영역의 번지수. 번지수를 불러온다.
		//그렇기 때문에 안의 값이 1번을 지나 이미 변한 채로((값이 초기화)사라지지 않은 채) 올라온다. 
		System.out.println("A="+a+" B="+b); 	//2번 앙녕하이, 하이
		//앙녕하이 출력 후 다시 앙녕하이 번지수를 불러와서 똑같이 출력
	}
	
	static void add(StringBuffer a,StringBuffer b) {
		a.append(b);						//String ver. a+=b를 의미함 문자열 순서대로 연결
											//append는 값 자체를 변경하는 함수이므로 번지수 안의 값이 앙녕하이로 변경
		System.out.println("A="+a+" B="+b); //1번 앙녕하이, 하이
	}

}


/*
 * 문자열처리 클래스
 * 
 * -String
 * 
 * -StringBuffer / StringBuilder
 * 네트워크를 할 수 있음/네트워크를 할 수 없음 
 */
