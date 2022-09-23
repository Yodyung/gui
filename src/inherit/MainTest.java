package inherit;

public class MainTest {

	public static void main(String[] args) {
		
		//Umma u=new Umma();
		//u.job();
		//u.gene();
		//System.out.println();
		
		//Ddal d=new Ddal();
		//d.job();
		//d.gene();
		//d.study();
		
		//Ddal dd=new Umma();		//메모리 10개중 11개를 쓰겠다! (오류)
		
		// *부모변수에 자식객체 생성이 가능
		Umma uu=new Ddal();			//메모리를 10개중 일부를 쓰겠다!
		uu.gene();
		//uu.study(); 				//벤다이어그램으로 생각하기! 본체가 엄마(더 작음)이기 때문에 자식클래스의
									//고유의 메소드는 메모리 밖의 일이라 불러올 수 없다.
									//but 오버라이딩 된 메소드는 자식 메모리의 것을 불러온다.
		
		// *형변환 : (casting)
		// 1) 기본형끼리는 가능
		// 2) 참조형에서는 !상속 관계에 있는 경우만! 가능, 부모 자식 관계에 있을때만!
		//	String s=new String("~~");
		//	StringBuffer sb=(StringBuffer)s; ==> X 안됨
		
		//Umma u=new Umma();
		//Ddal d=(Ddal)u;	//돌아가긴 하는데 에러남

		Ddal d=new Ddal();
		Umma u=(Umma) d;	//upcasting
		Ddal d2=(Ddal)u;	//downcasting
	}

}
