package z_test;

public class Book {
	
	String a;	//제목
	String b;	//저자
	String c;	//출판사
	
	public void book(String a,String b,String c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		Book bb=new Book();
		bb.a="제목";
		bb.b="저자";
		bb.c="출판사";
		System.out.println(bb.a);
		System.out.println(bb.b);
		System.out.println(bb.c);
		
		bb.book("제목2", "저자2", "출판사2");

	}

}
