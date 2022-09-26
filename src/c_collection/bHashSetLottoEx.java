package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();
		//HashSet은 중복값이 설정되지 않는다. 자동으로 중복값을 걸러줌.
		
		//(int i = 0; i < 6; i++)	//6으로 설정해놓는 이유는 HashSet으로 설정해놓은 ArrayList는 값이 설정되어 있지 않으므로 0값만 들어감. 그래서 6이라는 숫자를 설정해줘야함
		while(lottos.size()<6) {	//for문으로 돌리면 중복값이 나왔을 때, 중복 값이 출력이 안됨 중복값을 뺀 나머지 값만 보임. 
			int num=(int)(Math.random()*45)+1;	//while로 돌리면 6개가 중복값이 되지 않고 다 나올 때까지 출력을 해줌.
			lottos.add(num);
			}
		
		System.out.println(lottos);		//위의 while 구문 출력
		
		ArrayList<Integer>list=new ArrayList<Integer>(lottos);
		Collections.sort(list);		//while문에서 나온 값들을 순서대로 정렬
		System.out.println(list);	//정렬한 값을 출력
		}
		
	}

