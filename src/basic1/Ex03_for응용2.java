package basic1;

public class Ex03_for응용2 {

	public static void main(String[] args) {
		/*
		 [ 문제 1 ] 아래와 같이 출력하기
A
AB
		 */		
		for(int i=0; i<26; i++) {				//A 한글자 부터 시작, 글자를 하나씩 추가해야함. A-Z까지 증가해야함
			for(char a='A'; a<='A'+i; a++) {	//A부터 시작; a가 A+i(A+0(A),A+1(A,B),A+2(A,B,C),A+3(A,B,C,D)..)보다 작거나 같을시; a는 1씩 증가란 조건문
				System.out.print(a);			//위 조건을 가진 A를 순서대로 출력
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("---------------------------------------------------------------------");
//		 [ 문제 2 ] 아래와 같이 출력하기
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
	//	ABCDEFGHIJKLMNOPQRSTUVWXY
	//	ABCDEFGHIJKLMNOPQRSTUVWX
	//	ABCDEFGHIJKLMNOPQRSTUVW
	//	ABCDEFGHIJKLMNOPQRSTUV
	//	:
	//	A
		for(int i=0; i<26; i++) {				//A부터 Z까지 26글자로 시작, 글자를 하나씩 빼가야함. A-Z까지 증가해야함
			for(char a='A'; a<='Z'-i; a++) {	//A부터 시작; a가 Z-i(Z-0(Z),Z-1(Z,Y),Z-2(Z,Y,X),Z-3(Z,Y,X,W)..)보다 작거나 같을시; a는 1씩 증가란 조건문
				System.out.print(a);			//위 조건을 가진 a를 순서대로 출력
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("---------------------------------------------------------------------");
//		 [ 문제 3 ] 아래와 같이 출력하기	
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		BCDEFGHIJKLMNOPQRSTUVWXYZ
//		CDEFGHIJKLMNOPQRSTUVWXYZ
//		DEFGHIJKLMNOPQRSTUVWXYZ
//		:
//		XYZ
//		YZ
//		Z
		for(int i=0; i<26; i++) {	//A부터 Z까지 26글자로 시작, 글자를 하나씩 빼가야함(but 앞글자부터 빠짐). A-Z까지 증가해야함
			for(int a='A'+i;a<='Z';a++) {		//A+i(A+0(A),A+1(B),A+2(C),A+3(D)...)부터 시작 초기치에 연산을 하기위해 int 사용;
												//a가 Z보다 작거나 같을시; a는 1씩 증가란 조건문
				System.out.print((char)a); 		//한 글자로 나타내야 하므로 int를 char로 캐스팅해준다. 자동캐스팅이 되지 않으니 수동캐스팅 해야함. char 없을 시 코드로 나옴
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
//		 [ 문제 4 ] 아래와 같이 출력하기		
//		Z
//		ZY
//		ZYX
//		:
//		ZYXWVUTSRQPONMLKJIHGFEDC
//		ZYXWVUTSRQPONMLKJIHGFEDCB
//		ZYXWVUTSRQPONMLKJIHGFEDCBA		
		for(int i=0; i<26; i++) {				//Z 한글자 부터 시작이니까 글자를 하나씩 더해가야함. Z-A까지 감소해야함
			for(char a='Z'; a>='Z'-i; a--) {	//Z부터 시작; a가 Z-i(Z-0(Z),Z-1(Z,Y),Z-2(Z,Y,X),Z-3(Z,Y,X,W)...)보다 크거나 같을시; a는 1씩 감소란 조건문
				System.out.print(a);			//위 조건을 가진 a를 순서대로 출력
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
//		[ 도전문제 5 ] 아래와 같이 출력하기​
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		 BCDEFGHIJKLMNOPQRSTUVWXYZ
//		  CDEFGHIJKLMNOPQRSTUVWXYZ
//		   DEFGHIJKLMNOPQRSTUVWXYZ
//		       :
//	                       	  WXYZ
//		                       XYZ
//		                        YZ                                   
//		                         Z		
		for(int i=0; i<26; i++) {			//A부터 Z까지 26글자로 시작, 글자를 하나씩 빼가야함(but 앞글자부터 빠짐). A-Z까지 증가해야함
			for(int j=0;j<i;j++) {			//0부터 시작; i보다 숫자가 적을시; j는 1씩 증가
				System.out.print(" ");		//앞의 부분을 띄어 오른쪽 정렬이 될 수 있도록 밑의 for문이 한번 돌 때마다 띄어쓰기를 해준다.
			}
			for(int a='A'+i;a<='Z';a++) {	//A+i(A+0(A),A+1(B),A+2(C),A+3(D)...)부터 시작 초기치에 연산을 하기위해 int 사용;
				System.out.print((char)a);	//한 글자로 나타내야 하므로 int를 char로 캐스팅해준다. 자동캐스팅이 되지 않으니 수동캐스팅 해야함. char 없을 시 코드로 나옴
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------");

	}

}
