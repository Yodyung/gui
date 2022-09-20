package basic2;

import java.util.Scanner;

public class Ex03_방탈출2 {

	public static void main(String[] args) {
		
		//369 scanner
		
		Scanner sc=new Scanner(System.in);
		System.out.println("임의의 정수를 입력해주세요.(1-100,000)");
		int im=sc.nextInt();
		int count=0;
		int temp=0;		//임시변수 
		
		for(int i=0;i<=im;i++) {
			int j=i;
			boolean jj=false;
			
			while(j!=0) {
				int sam=j%10;
				if(sam==3|sam==6|sam==9) {
					System.out.print("짝!");
					count++;
					jj=true;
				}
				j=j/10;
			}
			if(jj) System.out.print("("+i+") ");
			else System.out.print(i+"- ");

		}
		System.out.println();
		System.out.println(im+"에 숫자 3,6,9가 포함되어 총 "+count+"회 손뼉을 칩니다.");
		//3,6,9,13... 넣어야할 변수만들어서 출력해야함.

		sc.close();
	}

}
