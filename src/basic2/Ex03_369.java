package basic2;
/*
 * [문제]
 * 
 * 1부터 50까지의 숫자 중에서 3,6,9 숫자가 포함되면 그 갯수 만큼 '짝' 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력
 */

public class Ex03_369 {

	public static void main(String[] args) {

		for(int i=1; i<51; i++) {			//1-50까지의 숫자 설정
			int su=i;						//i 값을 담을 변수 선언 및 설정
			boolean su369=false;			//"짝"이 나왔을 시 한 줄 띄어쓰기를 해주기 위해, "짝"이 나오지 않으면 i를 출력해주기 위해 중복 값 방지는 위해 변수 선언

			while(su!=0 ) {					//su가 0이 아닐때 while문이 계속 돌아감
				int na=su%10;				//int na는 su를 10으로 나눈 나머지 값을 담는 변수라고 선언

				if(na==3|na==6|na==9) {		//na의 나머지 값이 3이나 6이나 9일시 
					System.out.print("짝");	//"짝" 을 출력한다.
					su369=true;				//"짝"이 나왔을 시 한 줄 띄어쓰기를 해주기 위해, "짝"이 나오지 않으면 i를 출력해주기 위해 있는 변수
				}							//짝이 나왔을 시에 true로 값을 반환한다.
				su = su/10;
			}
			if(su369) System.out.print(" ");	//if문은 true면 실행 false면 정지이므로 조건에 su369를 걸고 한 줄 띄어쓰기 조건 실행
			else System.out.print(i+" ");		//false라면 그냥 i값 숫자 출력
		}

	}

}
