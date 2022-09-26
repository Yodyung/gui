package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		//1. 스택(LIFO)	//서랍에 물건을 차례대로 쌓고 가장 마지막에 들어간 것 부터 먼저 빼는 느낌
		
		Stack s=new Stack();	//stack은 마지막에 들어간 애가 먼저 나옴. 먼저 꺼내주는 구조.
		s.push("A");	//stack 에 넣을때는 push로 넣어줌
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());	//pop으로 뽑는다.
		
		//2. 큐(FIFO)	//빨대 같이 먼저 들어간 값이 밑으로 먼저 나오는 느낌
		Queue q=new LinkedList();	//선착순이라 먼저 넣은 값이 먼저 나온다.
		q.offer("A");
		q.offer("B");	//offer로 값 넣어줌
		q.offer("C");
		
		System.out.println(q.poll());	//poll로 뽑는다.

	}

}
