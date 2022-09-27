package d_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest {
	//1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton []bNum=new JButton[10];	//0~9 숫자를 표현할 버튼
	JButton []bOp=new JButton[4];	//연산자 +,-,/,* 표현할 버튼
	JButton bEqual;					// = 을 표현할 버튼
	
	int first, second;				//숫자 값을 저장할 변수 선언
	String op;						//연산자 값을 저장할 변수 선언

	//2. 객체 생성
	CalTest(){
		f=new JFrame("초등학생 계산기");	//창 제목 설정
		tf=new JTextField(44);		//텍스트 필드 크기 설정
		bEqual=new JButton("=");	//버튼 = 값 설정 

		bOp[0]=new JButton("+");	//버튼 배열에 각 방에 들어갈 값 설정해주기
		bOp[1]=new JButton("-");
		bOp[2]=new JButton("*");
		bOp[3]=new JButton("/");
		for (int i = 0; i < bNum.length; i++) {		//for문으로 배열 안에 숫자 차례대로 넣기
			bNum[i]=new JButton(String.valueOf(i));	//i값이 숫자라서 그걸 String.valueOf(i) 문자값으로 받음
		}

		//스트링.밸류


	}	//end CalTest

	//3. 화면 구성 및 화면 출력
	void addLayout() {
		JPanel jpdown=new JPanel();				//버튼 올릴 패널 만들기
		jpdown.setLayout(new GridLayout(5,3));	//패널의 레이아웃 그리드로 설정
		for (int i = 1; i<10; i++) {			//그리드 안에 bNum배열을 for문으로 차례대로 위치지정 
			jpdown.add(bNum[i]);				// 0번방의 1부터~8번방의 9까지 차례대로 넣기
		}//for문 끝
		jpdown.add(bOp[0]);						//연산자 버튼 넣기
		jpdown.add(bNum[0]);					//0 넣기
		jpdown.add(bEqual);						//= 넣기
		for (int i = 1; i <4; i++) {			//그리드 안에 bOp배열을 for문으로 차례대로 위치지정
			jpdown.add(bOp[i]);					//1번방의 -부터~3번방의 /까지 차례대로 넣기
		}//for문 끝
		f.add(jpdown,BorderLayout.CENTER);		//패널을 보더레이아웃으로 가운데 위치 지정

		//텍스트창 생성
		JPanel jptx=new JPanel();				//텍스트 입력 창 올릴 패널 만들기
		jptx.add(tf);							//텍스트 입력창 넣기
		f.add(jptx,BorderLayout.NORTH);			//패널을 보더레이아웃으로 위쪽에 위치 지정


		f.setBounds(100,100,500,350);						//사이트의 크기 설정
		f.setVisible(true);									//true이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x키를 누르면 프로그램 자동 종료
	}	//end addLayout

	//4. 이벤트 처리
	void eventProc() {
		//'=' 버튼이 눌렸을 때
		bEqual.addActionListener(new ActionListener(){		//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				second=Integer.parseInt(tf.getText());		//second 변수에 수식 뒤에 들어갈 수를 저장한다.	
				int result=0;								//출력할 최종 값을 넣을 변수 선언.
				switch(op) {
				case "+" : result=first+second; break;		//op에 +가 들어왔을 때의 결과 넣어주기
				case "-" : result=first-second; break;		//op에 -가 들어왔을 때의 결과 넣어주기
				case "/" : result=first/second; break;		//op에 /가 들어왔을 때의 결과 넣어주기
				case "*" : result=first*second; break;		//op에 *가 들어왔을 때의 결과 넣어주기
				}
				tf.setText(String.valueOf(result));			//=을 누르면 first와 second 의 수식 결과를 출력한다.
				
				
			}	
		});	//addActionListener 끝
		
		//숫자 버튼이 눌렸을 때
		for(int i=0;i<bNum.length;i++) {			
			bNum[i].addActionListener(new ActionListener(){ //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				public void actionPerformed(ActionEvent e) {//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
					JButton eBtn=(JButton)e.getSource();
												//이벤트가 발생한 컴포넌트의 주소, 참조값을 얻어옴
					String su=tf.getText()+eBtn.getText();	//su에 String 값으로 이벤트가 발생한 버튼값을 저장+새로 입력하는 값까지 누적해서 저장
					tf.setText(su);							//저장된 값 출력
				}	
			});	//addActionListener 끝
		}	//for문 끝
		
		//연산자 버튼이 눌렸을 때
		for(int i=0;i<bOp.length;i++) {			
			bOp[i].addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				public void actionPerformed(ActionEvent e) {//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
					JButton eBtn=(JButton)e.getSource();
															//이벤트가 발생한 컴포넌트의 주소, 참조값을 얻어옴
					op=eBtn.getText();						//op에 String 값으로 이벤트가 발생한(눌려진) 버튼값을 저장
					first=Integer.parseInt(tf.getText());	//연산자 버튼이 눌렸을 때를 기점으로 화면에 출력되어 있는 숫자를 first변수에 저장한다.
					tf.setText(null);						//앞의 값을 연속해서 받은 다음 연산자를 누른 다음 값을 제대로 받기 위해 tf창 초기화를 시켜주기.
				}	
			});	//addActionListener 끝
		}	//for문 끝
		
	}	//end eventProc


	public static void main(String[] args) {
		CalTest cal=new CalTest();
		cal.addLayout();
		cal.eventProc();

	}

}
