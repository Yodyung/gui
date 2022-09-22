package singleton;

public class WorkC {
	
	DbConnect con;
	
	public WorkC() {
		//con=new DbConnect();
		con=DbConnect.getInstance();
	}
	
	public void use() {
		System.out.println("C 작업");
	}

}
