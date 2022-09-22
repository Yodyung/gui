package singleton;

public class WorkB {
	
	DbConnect con;
	
	public WorkB() {
		//con=new DbConnect();
		con=DbConnect.getInstance();
	}
	
	public void use() {
		System.out.println("B 작업");
	}

}