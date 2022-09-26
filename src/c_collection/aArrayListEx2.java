package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics<>,<> 지정 (넣고자 하는 자료형을 정확히 입력하는것)
		
		list.set(3, "rat");		//fox 대신에 rat으로 덮어씌워진다.
		System.out.println(list);
		
		//list.remove(1);			//1번 자리에 있던 zebra가 지워지고 한칸씩 앞으로 땡겨진다.
		//System.out.println(list);
		
		Collections.sort(list);		//자동으로 순서대로 배열을 해준다.
		System.out.println(list);

		//System.out.println(list); 		// [] <== 배열을 뜻한다.

		System.out.println("-------------");
		for (int i = 0; i < list.size(); i++) {
			String data=(String)list.get(i);		//object형으로 리턴 해주기 때문에 받을때 리턴값을 지정해서 형변환하여 받아주어야 한다.
			System.out.println(data);
		}
		
		//향샹된 for문
		System.out.println("---------------");
		for(String data:list) {		//오른쪽 집합에서 하나씩 뽑아서 왼쪽에 넣기
			System.out.println(data);	//향상된 for문을 사용하기 위해서는 generics<>가 꼭 있어야한다.
		}
	}
}
