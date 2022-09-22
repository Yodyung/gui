package basic4;

public class MainTest {

	public static void main(String[] args) {
		
		
		//값 지정 1 -setter
		
//		Student s=new Student();	//class를 stack 메모리에서 heap 메모리로 불러야 사용가능. Student s; 라고 선언만 할 시 사용 불가능.
//		s.setName("예사랑");
//		s.setKor(98);
//		s.setEng(89);
//		s.setMat(77);

		//값 지정 2-생성자
		Student ss=new Student();				//기본 생성자 먼저 훑고 가는데 기본 생성자 내에서 밑의 인자가 있는 생성자를 호출하고
												//인자 있는 생성자 부터 출력, 그리고 다시 돌아가 기본생성자 출력
		Student st=new Student("예사랑",90,80,70);//기본 생성자 거치지 않고 바로 인자가 있는 생성자 출력
		
		//s.total=0; 		//private화 되어 사용 불가능
		st.calTotal();		//총점 미리 부르고
		st.calAvg();		//평균을 계산해야 평균까지 정확히 출력가능
		st.output();		//평균계산, 총점 순서 바뀌면 평균 출력 안됨
		
		
		
		
	}

}

/*
 * 캡슐화
 * 	-멤버변수(field) : private
 * 	-멤버메소드(Method) : public
 */
