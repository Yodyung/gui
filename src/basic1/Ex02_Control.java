package basic1;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_Control {

	public static void main(String[] args) {
				
		Scanner input=new Scanner(System.in);
		System.out.println("주민등록번호 입력(- 포함으로 입력하세요.)");
		String id=input.nextLine();
		
		
		id.charAt(7);
		char ye=id.charAt(7);
		System.out.println(ye);
		//ye 변수에 문자가 1이거나 3이거나 9이라면 남자출력
		//ye 변수에 문자가 2이거나 4이거나 0이라면 여자출력
		
		//논리 연산자는 or변수를 쓸 때 || 두개 써야함. 이럴 때에는 뒤에 있는걸 바로 연산하지 않고 그냥 지워버린 채 수식 적용
		//이제는 | 한개를 써도 동일하게 처리해주겠다~ 라고 인식 한다고 함 요즘 트렌드는 한개 쓰는거
		
		if(ye=='2'|ye=='4'|ye=='0') {
			System.out.println("여자입니다.");
		}else if(ye=='1'|ye=='3'|ye=='9') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		char chul=id.charAt(8);
		System.out.println(chul);
		String home=null;
		
		switch(chul) {	//문자,정수, 숫자열
		case '0': home="서울"; break;
		case '1': home="인천/부산"; break;
		case '2': home="경기"; break;
		case '3': home="울산"; break;
		case '4': home="모름"; break;
		case '5': home="어쩌고"; break;
		case '6': home="저쩌고"; break;
		case '7': home="울렐레"; break;
		case '8': home="독도"; break;
		case '9': home="제주도";	//마지막은 어차피 걸려서 나가니까 굳이 브레이크 걸지 않아도 됨
		}
		
		System.out.println(home+" 출신");
	
		//String id="941116-2723456";

		String nai=id.substring(0,2);	//nai="80" 문자열
		// 문자열 -> 정수 변환
		int sunai=Integer.parseInt(nai);	//sunai=80	숫자
		
		int age=0;
		
		Calendar cal=Calendar.getInstance();	//cal에 PC 캘린더를 Calendar클래스의 getInstance메소드를 가져옴
		int year=cal.get(Calendar.YEAR);		//year에 pc캘린더의 년도를 인풋 받음
		
		if(ye=='3'|ye=='4') 
			age=year-(2000+sunai)+1;
		else if(ye=='1'|ye=='2') 
			age=year-(1900+sunai)+1;
		else if(ye=='0'|ye=='9') 
			age=year-(1800+sunai)+1;
		
		System.out.println(age);
		
		input.close();
	
	}
	

}
