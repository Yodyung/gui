package b_info;
//데이터를 저장할 클래스 뒤에 VO를 붙힌다.

public class PersonVO {
	
	public PersonVO(){}	//기본 생성자 만들기
	
	//생성자 함수
	public PersonVO(String name, String id, String tel, String gender, String home, int age) {
		super();
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.gender = gender;
		this.home = home;
		this.age = age;
	}
		
	//변수 설정
	private String name;
	private String id;
	private String tel;
	private String gender;
	private String home;
	private int age;
	
	//setter getter 만들기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "[이름 :" + name + ", id : " + id + ", tel : " + tel + ", 성별 : " + gender + ", 주소 : " + home
				+ ", 나이 : " + age + "] \n";
	}
	
	
	
	
	
	

}
