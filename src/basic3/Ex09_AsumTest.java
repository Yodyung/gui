package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {
		//재귀 호출
		int sum=sumFun(4);
		System.out.println("합 : "+sum);
		
	}

	static int sumFun(int i) {		//인셉션 같은 느낌임
		//sum 1+2+3
		if(i==1) return 1;			//
		
		return i+sumFun(i-1);		//3값이 들어와서 2값을 다시 구할때 자기 자신의 함수로 다시 들어감 if부터 다시 체킹하고 
		//걸리지 않고 다시 밑의 식으로 돌아와서 1값을 구하고 1이 들어왔을때 값을 1을 리턴한다. 다시 거꾸로 올라가며 2값에 뒤에 1,
		//2값에 2를 채우고, 3값에 총합 3을 가지고 올라와 total 6이 된다.
	}
}
