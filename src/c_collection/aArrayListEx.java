
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] result=dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static Object[] dataSet()		//Object 배열은 웬만한 데이터값을 넣어서 리턴으로 넘길 수 있다.
	{
		String	name = "김태희";
		Integer age=31;//			int	age = 31; 현직에서는 인티저를 더 많이 씀
		double	height = 162.3;

		Object[]obj=new Object[2];	//정해진 갯수보다 더 큰 수만큼의 배열을 넣으면 에러가 뜬다.
		obj[0]=name;				//정적인 배열
		obj[1]=age;
		obj[2]=height;
		
		return obj;		//서로 다른 변수 종류들을 한 덩어리로 묶어서 리턴을 보낼 수 있다.
	}
}
