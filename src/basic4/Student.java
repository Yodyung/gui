package basic4;

public class Student {

	private String hakbun;
	private String name;
	private int kor, eng, mat;
	private int total;
	private double avg;
	
	//오버로딩 = 생성자 이름이 같지만 입출력이 다름
	public Student() {		//기본 생성자, 하나라도 생성자를 만들게 되면 자동 생성되지 않으므로 습관적으로 꼭 쓰기. 	
//		this.name="이름 없음";
//		this.kor=50;
//		this.eng=50;
//		this.mat=50;
		this("이름없음",50,50,50);		//this 함수는 무조건 가장 처음에 와야함
		System.out.println("기본생성자");
	}
	public Student(String name, int kor, int eng, int mat) {		//void 를 쓰지 않는 이유는 메소드가 아니라 생성자이기 때문!
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		System.out.println("인자가 있는 생성자");
	}
	
	
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void calTotal() {
		total=kor+eng+mat;
	}
	
	public void calAvg() {
		avg=total/3;
	}
	
	public void output() {
		System.out.println(name+"님 성적 : "+total+" / "+avg);
	}
	
}
