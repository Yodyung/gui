package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		
		for(int i=0; i<26; i++) {
			
			for(char a='A'; a<='Z'; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		
		/*
		 [ 문제 1 ] 아래와 같이 출력하기
A
AB
		 */		
		for(int i=0; i<26; i++) {		//총 26번을 반복하기 위한 for문
			
			for(char a='A'; a<='A'+i; a++) {	//A부터 A+0, A+1(A,B), A+2(A,B,C), A+3(A,B,C,D) ...A+25번까지 반복해라. 
				System.out.print(a);			//위의 반복문을 print로 출력해라.
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
//		 [ 문제 2 ] 아래와 같이 출력하기
		
		for(int i=0; i<26; i++) {
			
			for(char a='A'; a<='Z'-i; a++) {
				System.out.print(a);
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
		
		for(int i=0; i<26; i++) {				//총 26번을 반복하기 위한 for문
			
			for(int a='A'+i; a<='Z'; a++) {		//i값을 더해야 하는데 char에는 int값을 더할 수가 없어 int로 바꿈.
				System.out.print((char)a);		//출력을 char로 자동 캐스팅이 되지 않으므로 수동 캐스팅한다.
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
		for(int i=0; i<26; i++) {
			
			for(char a='Z'; a>='Z'-i; a--) {	// Z-0부터 시작 Z 출력, Z-1은 Z,Y 출력
				System.out.print(a);
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
		for(int i=0; i<26; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int a='A'+i; a<='Z'; a++) {
				System.out.print((char)a);	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		
		
		

	}

}
