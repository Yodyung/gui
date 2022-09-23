package polymo;

public class Book extends Item {
	String who;
	String where;

	Book(){
		this("0", "책제목없음", "무명", "출판사");
		System.out.println("Book의 기본 생성자");
	}
	
	Book(String number, String title,String who, String where){
		//super.number=number;	
		//super.title=title;
		super(number,title);
		this.who=who;
		this.where=where;
		System.out.println("Book의 인자 생성자");
	}
	
	public void output() {
		System.out.println(number+","+title+","+who+","+where);
	}
	

}
