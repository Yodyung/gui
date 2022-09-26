
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList list=dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for (int i = 0; i < list.size(); i++) {		//ArrayList는 length대신에 size()를 사용한다.
			System.out.println(list.get(i));
		}
	}

	static ArrayList dataSet()		//ArrayList는 자주 사용됨
	{
		String	name = "김태희";
		Integer age=31;//			int	age = 31; 현직에서는 인티저를 더 많이 씀
		double	height = 162.3;

		ArrayList list=new ArrayList();		//갯수가 명확하지 않으면 유동적인 어레이리스트를 사용한다. 배열과 다르게 적어놓은 수와 다르게 더 커져도 알아서 늘어난다.
		list.add(name);						//동적인 배열, 주로 값을 정해놓지 않고 사용한다.
		list.add(age);
		list.add(height);
		
		
		return list;		//서로 다른 변수 종류들을 한 덩어리로 묶어서 리턴을 보낼 수 있다.
	}
}
