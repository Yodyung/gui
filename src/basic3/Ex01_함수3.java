package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {

		int[]result=add();
		//a와 b의 값을 받아서 합한한 결과물
		//여기서 출력
		result[0]=10;
		result[1]=20;
		int sum=result[0]+result[1];
		System.out.println(sum);
	}
	
	static int[] add() {
		int a=10, b=10;
		int[]arr= {a,b};
		
		return arr;
		
	}

}
