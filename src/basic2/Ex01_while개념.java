package basic2;

public class Ex01_while개념 {

	public static void main(String[] args) {
		
		//0. for문
		int sum=0;
		for(int i=1; i<11; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------");
		
		//1. while문
		
		//초기치는 반복블록 위로, 증가치를 반복문 끝으로,
		//조건문만 남아서 for -->while 
		sum=0;			//합계를 담을 변수 선언
		int i=1;		//초기치를 반복블록 위에 선언
		while(i<11) {	//조건문만 ()안에 선언
			sum+=i;		//sum=sum+i;과 같은 의미. (sum+j(0+1),sum+j(1+2),sum+j(3+3),sum+j(6+4)...)
			i++;		//증가치는 반복문 끝에 선언
		}
		System.out.println(sum);	//합계치 출력
		
		System.out.println("-----------------------");
		
		//2. do~while문											**shift+alt+r = 같은 이름의 변수명 한꺼번에 변경**
		sum=0;					//합계를 담을 변수 선언
		i=1;					//초기치를 반복블록 위에 선언
		do {
			sum+=i;				//sum=sum+i;과 같은 의미. (sum+i(0+1),sum+i(1+2),sum+i(3+3),sum+i(6+4)...)
			i++;				//증가치는 do문 끝에 선언
		} while(i<11);			//조건문은 while()안에 선언
		System.out.println(sum);//합계치 출력
		
		//while do~while의 차이! ***do~while은 처음 시작 시 무조건 false값일지라도 한 번은 실행 후 종료, while문은 false값이면 바로 실행 종료***

	}

}
