package basic5;

public class MainTest {

	public static void main(String[] args) {
		//함수 ctrl+마우스 클릭해서 들어가면 어디에 있는 함수인지 이동함.
		Book b1=new Book();
		System.out.println("총 갯수 : "+b1.getCount());
		
		Book b2=new Book();
		System.out.println("총 갯수 : "+b2.getCount());
		
		//Book b3=new Book();
		//System.out.println("총 갯수 : "+b3.count);
		
		//Book b4=new Book();
		//System.out.println("총 갯수 : "+b4.count);

		System.out.println(Book.a="안녕"); 
		System.out.println("총 갯수 : "+Book.getCount());	
		//객체 생성보다도 먼저 실행하기 때문에 클래스명 접근이 가능하다.
		//Book b1=new Book(); 이라고 안해도 됨.
		
	}

}
