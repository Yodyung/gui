package basic1;

import java.util.Scanner;

public class Ex02_Control2 {

	public static void main(String[] args) {
		/*
		 우리대학의 학번은 총 10자리로 되어 있습니다.
맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.
     1 : 공대
     2 : 사회대
그 뒤의 2자리는 각 학과번호입니다.
  공과대학인 경우는
     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
     22 : 자바학과         33 : 서버학과
사회대학인 경우는
 11 : 사회학과         12 : 경영학과          13 : 경제학과
 ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
 ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
 ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다    		 
		 */
		
		Scanner sc=new Scanner(System.in);		//스캐너 삽입, 임포트 설정까지 하기!
		System.out.println("학번 10자리를 입력해주세요. >>");		//스캐너에 입력 전에 안내문 띄우기
		String studentNum=sc.nextLine();				//입력받을 변수를 엔터치기 직전까지 띄어쓰기 포함 다 받겠다는 의미
		//스캐너로 입력받을 변수 선언(↑)
		
		String hakbun=studentNum.substring(0,4);	//0번째부터 4번째 앞까지의 글자를 저장한다.
		String hakkwa=studentNum.substring(5,7);	//5번째부터 7번째 앞까지의 글자를 저장한다.
		char kwadae=studentNum.charAt(4);			//4번째 문자 하나를 저장한다.
		String kwadaeNum=null;
		String hakkwaNum=null;
		
		
		if(kwadae=='1') {
			kwadaeNum="공대";
			
			switch(hakkwa) {
			case "11" : hakkwaNum="컴퓨터학과"; break;
			case "12" : hakkwaNum="소프트웨어학과"; break;
			case "13" : hakkwaNum="모바일학과"; break;
			case "22" : hakkwaNum="자바학과"; break;
			case "33" : hakkwaNum="서버학과"; 	
			}
		}//if
		else if(kwadae=='2') {
			kwadaeNum="사회대";
			
			switch(hakkwa) {
			case "11" : hakkwaNum="사회학과"; break;
			case "12" : hakkwaNum="경영학과"; break;
			case "13" : hakkwaNum="경제학과";
			}
		}//else if
		System.out.println(studentNum+" 는 "+hakbun+"년도에 입학한 "+kwadaeNum+" "+hakkwaNum+" 학생입니다.");
		
		
		sc.close();
	}

}
