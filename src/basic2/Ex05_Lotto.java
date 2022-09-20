package basic2;
/*
 * int a=5, b=10;
 * int temp;
 * temp=a;
 * a=b;
 * b=temp;
 * ----------------------------------------
 * 
 * Math.random() : 0.0 소수점수<1.0
 * ex)  0.1234	*10 = 1.234
 * 		0.11234	*10 = 1.1234
 * 		0.5673	*10 = 5.673
 * 		0.9999	*10 = 9.999
 * 
 * ((int)Math.random()*10)
 * ex)  0.1234	*10 = 1.234	 =>1
 * 		0.11234	*10 = 1.1234 =>1
 * 		0.5673	*10 = 5.673  =>5
 * 		0.9999	*10 = 9.999  =>9
 * 
 */

public class Ex05_Lotto {

	public static void main(String[] args) {
		// 
		int [] lotto= new int[6];
		//값 지정
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}

		//정렬
		for(int i=lotto.length-1;i>0;i--) {		
			//i는 배열의 총 길이보다 -1작은 방부터; i가 1이 될때까지 반복한다; i는 하나씩 감소;
			for(int j=0; j<i; j++) {		//j가 i보다 크지 않을때까지 구문 실행(ex.0<5, 1<5, 2<5..)
				if(lotto[j]>lotto[j+1]) {	//lotto[j]가 lotto[j+1]보다 클 때 밑의 구문을 실행해라.
					int temp=lotto[j];		//lotto[j] 값을 담을 변수 설정, lotto[j]를 temp에 담음.
					lotto[j]=lotto[j+1];	//비어있는 lotto[j+1]에 lotto[j]를 담음.
					lotto[j+1]=temp;		//temp 값을 lotto[j+1]에 담음

				}
			}
		}

		//번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		System.out.println("----------------------------------");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();

		for(int k:lotto) {
			System.out.print(k+" ");
		}
		System.out.println();





	}

}
