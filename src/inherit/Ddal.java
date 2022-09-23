package inherit;

public class Ddal extends Umma {
	
	public Ddal() {
		System.out.println("딸 생성");
	}
	
	public void study() {
		System.out.println("딸은 공부 중!");
	}
	
	public void job() {			//오버 라이딩
		System.out.println("딸은 구직중!");
	}	
	
	public void gene() {
		System.out.println("딸은 자식!");
	}
	
}
