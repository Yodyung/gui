package z_test;

import java.util.Calendar;

/*
 * 1> 구조적 프로그래밍 언어로서의 자바를 이용하여 프로그램을 작성한다.
    다음의 요구사항을 충족하는 프로그램의 소스코드를 작성하시고
    결과화면을 스크린 샷의 이미지 파일로 제출하시오

  [요구사항] 

  가. 자신이 태어난 년도인 숫자를 저장 할 수 있는 변수 year를 선언하고
      자신이 태어난 년도를 대입한다.     
      
  나. 자신의 나이를 저장할 수 있는 변수 age를 선언하고, 
     year 변수를 사용하여 자신의 나이를 계산하여 대입한다(공식:현재년도-태어난 년도)
     단, 현재 년도는 Calendar클래스를 사용하여 구해야한다
     그리고 age 와 year를 출력하여라
 */
public class Test1 {
	
	public static void main(String[] args) {
	
		int year=1994;
		int age;
		
		Calendar cal=Calendar.getInstance();
		int now=cal.get(Calendar.YEAR);
		
		age=now-year+1;
		
		System.out.println("당신의 나이는 "+age+"살 입니다.");
		System.out.println("당신이 태어난 년도는 "+year+"년 입니다.");
	}

}
