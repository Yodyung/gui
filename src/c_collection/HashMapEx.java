package c_collection;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapEx 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in);
		
		HashMap<String,String>  map = new HashMap<String,String>();
		map.put("javassem", "1111");
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버립니다.
		map.put("kimssem", "1234"); //id만 중복되지 않으면 비밀번호는 중복되어도 상관없음. (키값만 중복이 되지 않으면 됨)  
		map.put("kimjava", "9999");
		map.put("kimbabo", "1234");
		
		boolean stop = false;
		while( !stop )	//stop이 false가 아닐때 (true)
		{
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("패스워드 -> ");
			String pass = input.nextLine();			
			
			// 1-1. 입력받은 id가 map에서 key 부분에 해당되는 것이 있다면
			if(map.containsKey(id)) {
				// 2-1. 그 아이디와 같은 key의 value값과 입력받은 패스워드가 같다면 로그인 성공
				if(map.get(id).equals(pass)) {
					System.out.println("로그인 성공");
					stop=true;	//true값으로 변해서 while문이 false로 바뀌어 break가 걸려 멈춘다. 
				}else {
			    // 2-2. 패스워드가 다르다면 출력
					System.out.println("패스워드가 다릅니다.");
					continue;
				}
		   // 1-2. 없다면 해당하는 아이디 없다고 출력
		}else {
			System.out.println("해당하는 ID가 없습니다.");
			continue;
		}
			
		}
	}
}
