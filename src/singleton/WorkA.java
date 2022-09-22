package singleton;

public class WorkA {
	
	DbConnect con;
	
	public WorkA() {
		//con=new DbConnect();
		//con.getInstance();
		// ==>> 매번 새로 클래스를 열어서 데이터 생성을 함.
		
		con=DbConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}

}
