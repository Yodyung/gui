package basic1;

/*
 반복문 : for/while/do~while
 
 (1) for( 초기치; 조건문; 증가치) {
 		반복구문
 	}
 */

public class Ex03_for개념 {

	public static void main(String[] args) {
	
//		1) 1부터 10까지 합산	
		int aa=0;
		for(int i=0; i<11; i++) {	
			aa+=i;
		}
		System.out.println(aa);
		
//		1-1) 1부터 10까지 홀수 값의 합산
		int a=0;
		for(int i=1; i<11; i+=2) {
			a+=i;
		}
		System.out.println(a);
		int b=0;
		for(int i=1; i<11; i++) {
			if(i%2!=0) {
				b+=i;
			}
		}
		System.out.println(b);
/*
		 2) A부터 Z까지 출력
		for(char a='A'; a<='Z'; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(char a='A'; a<='Z'; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println();

		for(char a='Z'; a>='A'; a--) {	//조건문 비교연산자 잘 살펴보기!!!
			System.out.print(a+" ");
		}
		System.out.println();
*/		
		

	}

}
