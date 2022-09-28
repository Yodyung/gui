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

public class CalTest2 {
	JFrame f;
	JButton []number=new JButton[10];;
	JButton []plus=new JButton[4];;
	JButton equal;
	JButton eraise;
	JButton clear;
	JButton sarah;
	JTextField txt;
	//계산기 변수 설정
	int first, last;
	String pluss;


	CalTest2(){
		f=new JFrame("★발전된 계산기☆");
		//숫자 버튼 설정
		for (int i = 0; i < number.length; i++) {
			number[i]=new JButton(String.valueOf(i)) ;
		}//for end
		//연산자 및 다른 버튼 설정
		plus[0]=new JButton("+");
		plus[1]=new JButton("-");
		plus[2]=new JButton("/");
		plus[3]=new JButton("*");
		equal=new JButton("=");
		eraise=new JButton("<=");
		clear=new JButton("C");
		sarah=new JButton("♥");
		//입력창 설정
		txt=new JTextField(43);
		

	}//caltest2 end

	public void addLayout() {
		//전체 레이아웃 잡기
		f.setLayout(new BorderLayout());
		//패널 설정해서 버튼 붙히기
		JPanel pn=new JPanel(new GridLayout(6,3));
		pn.add(sarah);
		pn.add(clear);
		pn.add(eraise);
		for (int i = 1; i <10; i++) {
			pn.add(number[i]);
		}
		pn.add(plus[0]);
		pn.add(number[0]);
		pn.add(equal);
		for (int i = 1; i <4; i++) {
			pn.add(plus[i]);
		}
		f.add(pn,BorderLayout.CENTER);	//보더 레이아웃의 가운데에 설정
		//텍스트 입력창 붙히기
		f.add(txt,BorderLayout.NORTH);	//보더 레이아웃의 위쪽에 설정

		//기본 사이트 설정 세팅하기.
		f.setBounds(100,100,500,350);						//사이트의 크기 설정
		f.setVisible(true);									//true이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x키를 누르면 프로그램 자동 종료	
	}//addlayout end

	public void EventProc() {
		//(1) 이벤트 핸들러 만들기/핸들러 : 이벤트 처리 클래스
		//(2) 핸들러 객체 생성	
		//(3) 이벤트가 발생할 컴포넌트와 연결
		
		//하트 버튼를 눌렀을 때
		sarah.addActionListener(new ActionListener(){						//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		  			//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				JOptionPane.showMessageDialog(null, "개발자 요뎡님");			//팝업 창 뜨면서 출력할 메세지 입력. 
			}
		});	//sarah.addActionListener End
		//숫자 버튼을 눌렀을 때
		for (int i = 0; i < number.length; i++) {
			number[i].addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				public void actionPerformed(ActionEvent e) {	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
					JButton pbt=(JButton)e.getSource();			//이벤트가 발생한 컴포넌트의 주소, 참조값을 얻어옴
					String su=txt.getText()+pbt.getText();
					txt.setText(su);
				}
			});	//number.addActionListener End
		}	//for문 End
		//연산자 버튼을 눌렀을 때
		for (int i = 0; i < plus.length; i++) {
			plus[i].addActionListener(new ActionListener(){		//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				public void actionPerformed(ActionEvent e) {	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
					JButton pbt=(JButton)e.getSource();			//이벤트가 발생한 컴포넌트의 주소, 참조값을 얻어옴
					pluss=pbt.getText();
					first=Integer.parseInt(txt.getText());
					txt.setText(null);
				}
			});	//number.addActionListener End
		}	//for문 End
		//= 버튼을 눌렀을 때
		equal.addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
				public void actionPerformed(ActionEvent e) {	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				last=Integer.parseInt(txt.getText());
				int total=0;
				switch (pluss) {
				case "+" : total=first+last; break;
				case "-" : total=first-last; break; 
				case "/" : total=first/last; break;
				case "*" : total=first*last; break;
				}
				txt.setText(String.valueOf(total));
				}
			});	//number.addActionListener End
		
		//지우기 버튼을 눌렀을 때
		eraise.addActionListener(new ActionListener(){						//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		  			//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				//모르겠음 후히히;
			}
		});	//eraise.addActionListener End
		//전체 취소 버튼을 눌렀을 때
		clear.addActionListener(new ActionListener(){						//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		  			//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				txt.setText(null);
			}
		});	//clear.addActionListener End
		
		
		
		

	}//eventproc end

	public static void main(String[] args) {
		CalTest2 cal=new CalTest2();
		cal.addLayout();
		cal.EventProc();


	}

}
