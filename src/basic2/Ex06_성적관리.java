package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_성적관리 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 이용해야 함.
		 * 입력할 학생수를 입력하세요. 4
4명의 국어, 영어, 수학 점수를 받아 결과 출력하기
1째 학생의 성적을 입력 -> 88/77/66
2째 학생의 성적을 입력 -> 50/40/70
3째 학생의 성적을 입력 -> 44/33/22
4째 학생의 성적을 입력 -> 55/50/70

[결과]
1째 학생의 총점 xxx 이고 평균은 ooo 입니다
2째 학생의 총점 xxx 이고 평균은 ooo 입니다
3째 학생의 총점 xxx 이고 평균은 ooo 입니다
4째 학생의 총점 xxx 이고 평균은 ooo 입니다
------------------------------------------------------------
국어과목  총점 xxx 이고 평균은 ooo 입니다
영어과목  총점 xxx 이고 평균은 ooo 입니다
수학과목  총점 xxx 이고 평균은 ooo 입니다
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 학생 수를 입력하세요.(ex.4)");
		int student=sc.nextInt();
		sc.nextLine();			//쳐줘야 다음번 엔터칠 때 값을 따로 먹지 않고 실행됨.

		System.out.println(student+"명의 국어, 영어, 수학 점수를 예시대로 하나씩 입력하세요. ex) 88/77/66");

		int [][] jeon=new int[student][3];

		//배열의 입력 구문
		for(int i=0;i<student;i++) {		//행 반복
			String point=sc.nextLine();
			StringTokenizer st=new StringTokenizer(point,"/");
			for (int j = 0; st.hasMoreTokens(); j++) {		//열 반복
				String str = st.nextToken();
				jeon[i][j]=Integer.parseInt(str);
			}	
		}	//for문 끝

		//학생별 결과 출력
		System.out.println("[결과]");
		for(int i=0;i<jeon.length;i++) {
			int sum=0;
			for(int j = 0; j<jeon[i].length; j++) {
				sum+=jeon[i][j];
			}
			System.out.println(i+1+"번째 학생의 총점은 "+sum+"점이고, 평균은 "+sum/student+"점 입니다.");
		}
		//과목별 결과 출력
		int kor = 0, eng = 0, math = 0;

		for(int i=0;i<student;i++){
		kor += jeon[i][0];
		eng += jeon[i][1];
		math += jeon[i][2];
		}
		System.out.println("---------------------------------------------------------------");
		System.out.printf("국어과목 총점 %d 이고 평균은 %.2f 입니다.\n",kor,(double)kor/student);
		System.out.printf("영어과목 총점 %d 이고 평균은 %.2f 입니다.\n",eng,(double)eng/student);
		System.out.printf("수학과목 총점 %d 이고 평균은 %.2f 입니다.\n",math,(double)math/student);




		sc.close();

	}

}
