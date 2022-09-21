package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적 {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		
		int kor[]=new int[5];		//5명의 학생의 점수를 저장할 배열 선언
		int sum=0;					//학생들의 총점 구할 변수 선언 
		
		/*
		 * 3명의 국어점수를 입력하세요. (ex. 10/20/30)
		 */
		System.out.println(kor.length+"명의 국어점수를 입력하세요. (ex. 10/20/30)");
		String inputData=sc.nextLine();		//스캐너에 입력된 1줄 전체의 내용을 값으로 선언
		StringTokenizer st=new StringTokenizer(inputData,"/");	
		//StringTokenizer : (앞,뒤) 뒤의 "문자" 기준으로 앞 변수의 데이터를 자른다. 외부입력.
		for(int i=0; st.hasMoreTokens(); i++) {		//st.hasMoreTokens() : 앞에서부터 시작해서 뒤의 데이터가 없으면 false로 반환
			String str=st.nextToken();
			//nextToken : StringTokenizer에서 자른 데이터들을 새로운 변수값에 저장.
			kor[i]=Integer.parseInt(str);
			sum+=kor[i];
		} 
		
		System.out.println("학생들의 총점 : "+sum+"점, 평균 : "+sum/kor.length+"점");
			
			
		
		//inputData.split("/");
		/*
		for(int i=0; i<kor.length; i++) {	//총 길이가 배열의 길이보다 작을때로 조건 선언
			System.out.println(i+"번 학생의 국어점수를 입력 ->");		//출력할 안내문 설정
			kor[i]=sc.nextInt();	//배열의 i번째 방에 입력 값을 넣겠다는 선언
			sum+=kor[i];			//sum=sum+kor[i]; 선언
		}
		
		for(int i=0; i<kor.length; i++) {	//총 길이가 배열의 길이보다 작을때로 조건 선언
		System.out.println(i+"번 학생의 점수 : "+kor[i]);			//출력할 안내문 설정
		}
		
		System.out.println("학생들의 총점 : "+sum+"점, 평균 : "+sum/kor.length+"점");
		//위 학생들 점수의 총점과 평균을 출력할 안내문 설정
		 */
		
		sc.close();
		
	}

}
