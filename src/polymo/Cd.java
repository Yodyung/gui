package polymo;

public class Cd extends Item {
	String singer;

	Cd(){
		this("0","제목없음","가수모름");
		System.out.println("cd의 기본 생성자");
	}
	
	Cd(String number, String title,String singer){
		super(number,title);
		this.singer=singer;
		
	}
	
	public void output() {
		System.out.println(number+","+title+","+singer);
	}

}
