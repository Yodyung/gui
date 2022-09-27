package c_sample;

import java.awt.*;		//모든 클래스까지를 포함한다.
import java.awt.event.*;//그래서 하위 패키지까지는 포함하지 않기 때문에 써주어야 함.
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventTest2 {
	
	JFrame f;
	JButton bt;
	
	//멤버 변수 객체 생성
	EventTest2(){
		f=new JFrame("Event Test");				//프레임 설정
		bt=new JButton("확인");					//버튼 설정
	//(2) 핸들러 객체 생성	
	//	MyHandler hdlr=new MyHandler();			//이너클래스 이벤트 담을 변수 선언
	//(3) 이벤트가 발생할 컴포넌트와 연결	+(2) 함께 객체 생성
		bt.addActionListener(new MyHandler());				//버튼에다가 이너클래스 이벤트 담기
	}
	//(1) 이벤트 핸들러 만들기/핸들러 : 이벤트 처리 클래스
	class MyHandler implements ActionListener{	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
		@Override
		public void actionPerformed(ActionEvent e) {		  //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
			JOptionPane.showMessageDialog(null, "이벤트 발생 우앵우앵!");//팝업 창 뜨면서 출력할 메세지 입력. 
			
		}	
		
	}
	
	//화면 구성하고 출력
	public void addLayout() {
		//큰 창의 레이아웃 설정
		f.setLayout(new FlowLayout());						//레이 아웃을 한 줄에 맞춰서 배치 출력해줌
		//붙히기
		f.add(bt);											//버튼 붙히기
		
		f.setBounds(100,100,500,350);						//사이트의 크기 설정
		f.setVisible(true);									//true이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x키를 누르면 프로그램 자동 종료

		
		
	}

	public static void main(String[] args) {
		
		EventTest2 test=new EventTest2();
		test.addLayout();

	}

}
