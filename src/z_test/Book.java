package z_test;
/*
 * 1> 자바언어의 특징에 대해 설명하시오
    ( 인터넷에서 글을 복사해서 올리시는 것이 아니라, 
	본인이 정리해서 간략하게 올려주세요 )
	
	-자바언어는 대표적인 객체지향 언어이다.
	독립적인 운영체제를 쓰고, 멀티 쓰레드, 동적 로딩을 지원한다.
	자동 메모리 관리가 되고 캡슐화를 사용할 수 있다.
	자바는 개발자가 쉽게 코드를 작성하고 실행할 수 있으며, 강력한 디버깅을 제공한다.
	

2> 책 정보에 대한 정보를 관리하기 위해 Book 이라는 클래스를 만들고, 
    책제목, 저자, 출판사에 대한 정보를 저장하고,
    각각의 정보에 값을 지정하고 출력할 수 있도록 클래스를 설계하시오.

3> 어플리케이션을 최적화하기 위한 프로그래밍을 위해,
    위의 Book 클래스에 각각의 정보를 입력하기 위해 객체 생성시 값을 초기하고자 한다.
    위의 설계된 클래스에 생성자함수를 추가하시오.
 */

public class Book {
	
	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}

	String a;	//제목
	String b;	//저자
	String c;	//출판사
	
	public void book(String a, String b, String c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	

	public static void main(String[] args) {
		Book bb=new Book();
		bb.setA("제목");
		bb.setB("저자");
		bb.setC("출판사");
		System.out.println(bb.getA());
		System.out.println(bb.getB());
		System.out.println(bb.getC());
		
		bb.book("제목 없음","저자 미상","출판사 미상");
		System.out.println(bb.a);
		System.out.println(bb.b);
		System.out.println(bb.c);

	}

}
