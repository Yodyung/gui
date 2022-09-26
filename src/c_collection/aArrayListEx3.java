package c_collection;

import java.util.ArrayList;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result=method();		//같은 자료형으로 받아야합니다.
		
		System.out.println(result); //[]안에 배열 구조로 나온다.
		
		for(Student s:result) {		//배열이 오른쪽! 오른쪽에서 왼쪽으로 넣을거다! 오른쪽은 자료형 형태 맞춰주어야 하기 때문에 student로 선언.
			System.out.println(s);	//각 값 당 으로 한줄씩 나옴.
		}
		System.out.println("----------------------------------------");
		//[참고] 전체 요소를 순서대로 검색
		//		Enumeration -> Iterator
		java.util.Iterator<Student> it=result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	static ArrayList<Student> method() {
		ArrayList <Student>list=new ArrayList<Student>();
		//변수가 딱 한번 사용되면 변수를 잘 사용하지 않음, 바로 add안에 넣음
		list.add(new Student("홍길자",25));	//add : 값을 추가하는 변수
		list.add(new Student("홍길사",33));
		list.add(new Student("홍길삼",44));
		
		return list;
		
	}

}

//----------------------------------------------------------
class Student{		//자동으로 extends object가 들어가있음
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
