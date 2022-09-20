package basic2;

import java.util.Scanner;

/*
 1. for :	반복 횟수가 정해진 경우
 2. while :	반복 횟수가 몇 번인지 모르는 경우
 3. do~while : 반복 횟수가 몇 번인지 모르는 경우(조건을 나중에 비교)
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단 수를 입력 받아서 해당 단의 구구단을 출력 

		Scanner sc=new Scanner(System.in);			//입력 받아야 하기 때문에 스캐너 먼저 열기
		
		/*
		 System.out.println("몇 번 반복을 할까요?");		//먼저 입력 받아야 할 안내문 출력
		int su=sc.nextInt();						//su 변수에 su번 입력값을 넣겠다는 선언

		System.out.println("출력하고 싶은 구구단의 단 수를 입력하세요.");	//안내문 출력
		int gu=sc.nextInt();						//gu 변수에 gu단 입력값을 넣겠다는 선언

		//1.for문 
		for(int j=0;j<su;j++) {						//초기치; 조건문; 증가치; 설정(su 번 반복하겠다는 실행문)

			for(int i=1; i<10; i++) {				//초기치; 조건문; 증가치; 설정(gu 단 실행하겠다는 실행문)
				System.out.print(gu+"*"+i+"="+(gu*i)+" ");			//gu단으로 보일 안내문 출력
			}
			System.out.println();					//gu단 한 번 for 문 안에서 돌고 다음 번 출력시 한 칸 띄어주는 용도
		}
		
		//2. while문
		while(true) {										//조건문이 while문()내부에 위치
			System.out.println("원하는 구구단 단 수를 입력해주세요.");
			int i=sc.nextInt();								//원하는 구구단 단 수를 받을 변수 선언
			for(int j=1; j<11; j++) {						//i단을 돌릴 숫자의 조건문 설정
				System.out.print(i+"*"+j+"="+(i*j)+" ");	//i단으로 보일 안내문 출력
			}
			System.out.println("반복을 종료(Y)");				// Y 를 입력 시 while 문이 종료 된다는 안내문
			sc.nextLine();									// java의 오류(?)같은거 값을 입력 시 엔터 값 하나를 치고 입력해야 제대로 입력 됨. 그래서 넣어줌
			String answer=sc.nextLine();					// Y 나 Y외의 다른 값을 받을 변수 선언
			if(answer.equalsIgnoreCase("Y")) break;			// y or Y 대소문자 구분없이 입력 시 구문 탈출 선언
		}
		*/
		
		//3. do~while문
		
		do {
			System.out.println("원하는 구구단 단 수를 입력해주세요.");	//안내문 출력
			int i=sc.nextInt();									//원하는 단 수를 받을 변수 선언
			for(int j=1; j<11; j++) {							//i단을 돌릴 숫자의 조건문 설정
				System.out.print(i+"*"+j+"="+(i*j)+" ");		//i단으로 보일 안내문 출력
			}
			System.out.println("반복을 멈춥니까?(Y)");				// Y 를 입력 시 do~while 문을 탈출한다는 안내문
			sc.nextLine();										// java의 오류(?)같은거 값을 입력 시 엔터 값 하나를 치고 입력해야 제대로 입력 됨. 그래서 넣어줌
			String answer=sc.nextLine();						// Y 나 Y외의 다른 값을 받을 변수 선언
			if(answer.equalsIgnoreCase("Y")) break;				// y or Y 대소문자 구분없이 입력 시 구문 탈출 선언
		}
		while(true);		//조건문이 do문 밑 while문()내부에 위치
		
		sc.close();
	}

}
