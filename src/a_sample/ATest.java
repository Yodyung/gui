package a_sample;
/*
 * 자바의 GUI(화면)
 * -AWT : 1.2이전
 * -Swing : 1.2이후 
 * 			대부분 클래스 앞에 J
 */

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {		//has a 방식
	
	JFrame f;	//javax.swing.JFrame에서 임포트 해온다.
	JButton btn, btn2;		//버튼 
	JCheckBox java, oracle;	//네모 체크박스, 다중 선택을 해야할 때 사용
	JRadioButton man, woman;//동그라미 체크박스, 반드시 딱 한개만 선택해야 할 때 사용
	JTextField tf;		//한 줄 입력할 때 사용
	JTextArea ta;		//여러 줄 입력할 때 사용
	
	ATest(){
		f=new JFrame("사랑이 첫 창");
		btn=new JButton("확인");
		btn2=new JButton("취소");
		java=new JCheckBox("JAVA");
		oracle=new JCheckBox("ORACLE");
		man=new JRadioButton("남자");
		woman=new JRadioButton("여자");
		ButtonGroup group=new ButtonGroup();	//라디오버튼을 그룹화 해서 한가지 버튼만 선택할 수 있게 설정
		//그룹 지을 때 딱 한번만 사용하면 되니까 지역 변수로 만들어도 충분함.
		group.add(man);
		group.add(woman);
		tf=new JTextField(20);
		ta=new JTextArea(40,20);
	}
	
	void addLayout() {
		//붙히는 방식이 layout
		//FlowLayout f1=new FlowLayout();	1번만 쓰는 선언은 생략하고 밑에 바로 붙혀넣기해서 만들어주기.
		//f.setLayout(new FlowLayout());		//선언해서 붙혀주지 않으면 취소버튼만 나옴, 한 줄에 맞춰서 배치 출력해줌.
		//f.setLayout(new GridLayout(3,3));		//행, 열을 순서대로 맞춰서 나오게 배치 출력해줌
		f.setLayout(new BorderLayout());		// 동/서/남/북/가운데 배치
		//붙히기 작업
		f.add(btn,BorderLayout.NORTH);
		f.add(btn2,BorderLayout.SOUTH);
		//f.add(java);
		//f.add(oracle);
		JPanel pEast=new JPanel();		//패널로 묶어서 보더레이아웃 설정한다면 겹치지 않고 모두 나올 수 있음
		pEast.add(man);
		pEast.add(woman);
		f.add(pEast,BorderLayout.EAST);
		//f.add(man,BorderLayout.EAST);
		//f.add(woman,BorderLayout.EAST);	//이렇게 선언하면 남자위에 여자가 겹쳐져서 덮어씌워지기 때문에 여자만 출력됨
		f.add(new JLabel("입력하세요."),BorderLayout.WEST);	//글씨만 한줄 그냥 입력하는건 위에 선언하지 않고 바로 써도 가능하다.
		//f.add(tf,BorderLayout.EAST);
		f.add(ta,BorderLayout.CENTER);
		
		
		//화면 출력
		f.setBounds(100,100,500,350);						//사이트의 크기 설정
		f.setVisible(true);									//true 이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//X키를 누르면 시스템 프로그램 자동 종료가 된다.
		
	}

	public static void main(String[] args) {
		ATest a=new ATest();		//위의 페이지를 불러서 
		a.addLayout();				//레이아웃이 보이게 선언.

	}

}
