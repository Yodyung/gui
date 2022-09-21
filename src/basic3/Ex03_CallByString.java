package basic3;

public class Ex03_CallByString {

public static void main(String[] args) {
		
		String a=new String("앙녕");
		String b=new String("하이");

		add(a,b);
		System.out.println("A="+a+" B="+b); 	//2번 앙녕, 하이
		//기본 번지수에 있던 a가 그대로 출력되어 나옴. 오직 String 형만.
	}
	
	static void add(String a,String b) {
		a+=b;						//String만 혼자 별종이기 때문에 기본형처럼 쓸 수 있다. 
		//String은 값이 바뀌면 같은 번지수 안의 값이 바뀌는게 아니라 새 번지수를 만들어 그 곳에 값을 저장한다.
		System.out.println("A="+a+" B="+b); //1번 앙녕하이, 하이
		//새 번지수에서 출력 된 a가 나온다.
	}

	
}
