package zfinal;

class Parent {
	final String field="부모님꺼";		//다른 곳에서 변경할 수 없는 값 지정을 할 때 final을 사용
	final public void jib() {
		System.out.println("부모님이 사주신거");
	}
	
}

class Child extends Parent{
	Child(){
		//field="내꺼";		final 찍으면 앞으로 두번 다시 값을 못바꿈 
	}
	
	//public void jib() {
	//	System.out.println("내가 탕진함");
	//}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Child();
		System.out.println(p.field);
		p.jib();

	}

}
