package singleton;

//********************중요함 실무에 쓰임**************************
public class DbConnect {
	
	private DbConnect() {
		System.out.println("실제 DB 연결");
	}
	
	private static DbConnect con;
	
	public static DbConnect getInstance() {
		if(con==null) con=new DbConnect();
		return con;
	}
	//1번만 생성해서 나중에 DB가 연결되어 열릴 때 1번 열린 후 새로운 클래스를 여는게 아니라 한개를 가지고 쓰는 느낌..?
	//객체를 한번만 열어서 쓰겠다. 한 번 열어서 쓴 객체를 계속 가져다 쓰겠다. 
	//아무나 손잡이를 잡을수 없게 손잡이를 나만 잡을 수 있다. 문을 여는 열쇠를 나만 가지고 있음. 열어놓으면 아무나 들어오지만 나만 닫고 열 수 있음.
	//1번만 열어서 데이터 절약 및 보안성 강화
	
}
