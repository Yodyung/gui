package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet();	//자동으로 정렬된것 처럼 배열을 해서 나온다. 메모리 구조가 트리 구조로 되어있어서 자동으로 정렬이 되어 나옴.
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s"));		// d부터 s앞까지 출력
		System.out.println(set.headSet("e"));			// e 전까지 출력
		System.out.println(set.tailSet("e"));			// e 포함 이후 전부 출력

	}
}
