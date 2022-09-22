package basic4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CalculatorExpr ce=new CalculatorExpr();
		do {
		System.out.println("숫자를 입력해주세요.");
		int a=sc.nextInt();
		ce.setNum1(a);
		
		System.out.println("숫자를 한번 더 입력해주세요.");
		int b=sc.nextInt();
		sc.nextLine();
		ce.setNum2(b);

		System.out.print("추출된 숫자는 "+ce.getNum1()+", ");
		System.out.print(ce.getNum2());
		System.out.println();
		ce.getAddition();
		ce.getSubtraction();
		ce.getMultiplication();
		ce.getDivision();
	
		System.out.println("시스템을 종료합니까?(Y/N)");
		String su=sc.nextLine();
		
		if(su.equalsIgnoreCase("Y")) {System.out.println("시스템을 종료합니다."); break;}
		else {System.out.println("시스템을 재실행합니다.");}
		
		}
		while(true);

		sc.close();
	}
	

}
