package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {

	//1. 멤버변수 선언
	JFrame f;	//새 창을 만들기 위한 선언
	JTextField tfname, tfId, tfTel, tfGender, tfAge, tfHome;
	//한 줄 입력 받을 때 사용
	JTextArea ta;
	//여러 줄 입력 받을 때 사용
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	//버튼 삽입
	JLabel la;
	//글씨만 한 줄 입력해야 할 때 사용
	ArrayList<PersonVO> list=new ArrayList<PersonVO>();
	//add에 저장할 정보를 담을 배열

	//2. 멤버변수 객체생성
	InfoView(){
		f	  =new JFrame("DBTest");				//새 창의 헤드부분에 나올 도메인
		tfname=new JTextField(10);					//한 줄 입력 받을 창 크기 선언
		tfId  =new JTextField(10);
		tfTel =new JTextField(10);
		tfGender=new JTextField(10);
		tfAge =new JTextField(10);
		tfHome=new JTextField(10);
		ta	  =new JTextArea(40,20);				//여러 줄 입력 받을 창 
		bAdd  =new JButton("Add");					//각 버튼들 변수 선언
		bShow =new JButton("Show");
		bSearch=new JButton("Search");
		bDelete=new JButton("Delete");
		bCancel=new JButton("Cancel");
		bExit  =new JButton("Exit(alt+x)",new ImageIcon("src\\b_info\\imgs\\2.PNG"));//버튼에 이미지 삽입 new ImageIcon(아이콘 경로)
		bExit.setHorizontalTextPosition(JButton.CENTER);						//수평으로는 가운데에
		bExit.setVerticalTextPosition(JButton.BOTTOM);							//수직으로는 아래에
		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\3.PNG")); 		//마우스를 올렸을 때 아이콘이 바뀌게 함
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\4.PNG")); 		//클릭 했을 때 아이콘이 바뀌게 함
		bExit.setToolTipText("종료버튼입니다");										//마우스를 대고 있을 때 메세지박스가 뜨게 함
		bExit.setMnemonic('x');													//alt 키와 함께 설정한 키를 눌렀을 때 그 버튼이 눌리게 함


	}

	//3. 화면 구성하고 출력
	/*
	 * 전체 프레임은 BorederLayout 지정 
	 * west : Jpannel 만들어서 Jlabel과 JTextField tfname, tfId, tfTel, tfGender, tfAge, tfHome; (GridLayout(6,2))
	 * center : JTextArea ta;
	 * south : Jpannel 만들어서 JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit; (GridLayout(1,6))
	 */
	public void addLayout() {
		//Border 레이아웃으로 큰 창의 전체 레이아웃 먼저 설정
		f.setLayout(new BorderLayout());
		//붙히기 작업
		//하단 버튼 붙히기
		JPanel jpdown=new JPanel();				//버튼 올릴 패널 만들기
		jpdown.setLayout(new GridLayout(1,6));	//패널을 행,열 순서대로 나오게 배치 출력
		jpdown.add(bAdd);	//패널 위에 버튼 올리기
		jpdown.add(bShow);
		jpdown.add(bSearch);
		jpdown.add(bDelete);
		jpdown.add(bCancel);
		jpdown.add(bExit);
		f.add(jpdown,BorderLayout.SOUTH);	//보더 레이아웃의 아래쪽에 위치 선언

		//왼쪽 붙히기
		JPanel jpwest=new JPanel();						//입력 창과 입력 받을 창 올릴 패널 만들기
		jpwest.setLayout(new GridLayout(6,2));			//패널을 행,열 순서대로 나오게 배치 출력
		jpwest.add(new JLabel("Name",JLabel.CENTER));	//가운데 정렬하는 키 JLabel뒤 .center넣기
		jpwest.add(tfname);
		jpwest.add(new JLabel("ID",JLabel.CENTER));
		jpwest.add(tfId);
		jpwest.add(new JLabel("Tel",JLabel.CENTER));
		jpwest.add(tfTel);
		jpwest.add(new JLabel("Sex",JLabel.CENTER));
		jpwest.add(tfGender);
		jpwest.add(new JLabel("Age",JLabel.CENTER));
		jpwest.add(tfAge);
		jpwest.add(new JLabel("Home",JLabel.CENTER));
		jpwest.add(tfHome);
		f.add(jpwest, BorderLayout.WEST);	//보더 레이아웃의 왼쪽에 위치 선언

		//오른쪽 붙히기
		f.add(ta,BorderLayout.CENTER);		//보더 레이아웃의 가운데쪽에 위치 선언

		f.setBounds(100,100,500,350);		//사이트의 크기 설정
		f.setVisible(true);					//true이기 때문에 프로그램이 보이게 작동함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x키를 누르면 프로그램 자동 종료

	}

	//이벤트 처리 함수
	//버튼에다가 이너클래스 이벤트 담기
	public void eventProc() {
		//Add 버튼을 눌렀을 때 나오는 이벤트
		bAdd.addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				inputdata();							//각 입력창에 있는 정보를 저장하는 함수
				clearTextField();						//입력창에 있는 모든 정보들을 null값으로 바꿔놓는 함수					
				selectAll();							//ADD 버튼을 누를 시 알아서 저장값을 Show 해주는 것처럼 보이는 함수
			}	
		});	//add.addActionListener 끝										
		//show 버튼을 눌렀을 때 나오는 이벤트
		bShow.addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				selectAll();
				//버튼을 눌러도 이미 Add로 저장할 시 저장값을 자동으로 띄워주므로 새 정보가 추가되지 않아 다시 출력되지 않음.
			}	
		});			
		//search 버튼을 눌렀을 때 나오는 이벤트
		bSearch.addActionListener(new ActionListener(){					//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		 		//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				JOptionPane.showMessageDialog(null, "검색을 실행합니다!");	//팝업 창 뜨면서 출력할 메세지 입력. 
				selectbyTel();
			}	// end of actionPerformed
		});		// end of addActionListener
		//전화번호 텍스트필드에서 엔터 쳤을때 
		tfTel.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "검색을 실행합니다!");	//팝업 창 뜨면서 출력할 메세지 입력. 
				selectbyTel();											// getJuminInfo() 메소드를 생성해 반복되는 것 넣기
				getJuminInfo(); 
			} // end of actionPerformed
		} ) ; // end of addActionListener

		//delete 버튼을 눌렀을 때 나오는 이벤트
		bDelete.addActionListener(new ActionListener(){				//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		  	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				JOptionPane.showMessageDialog(null, "삭제 되었습니다!");//팝업 창 뜨면서 출력할 메세지 입력.
				deletebyTel();
				clearTextField();
			}	
		});			
		//exit 버튼을 눌렀을 때 나오는 이벤트
		bExit.addActionListener(new ActionListener(){				//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {		  	//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				JOptionPane.showMessageDialog(null, "Exit 버튼 클릭");//팝업 창 뜨면서 출력할 메세지 입력. 
			}	
		});	
		//주민번호 입력창에서 엔터 쳤을 때 이벤트 발생
		tfId.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				getJuminInfo(); 									// getJuminInfo() 메소드를 생성해 반복되는 것 넣기
			} // end of actionPerformed
		} ) ; // end of addActionListener 
		//cancle 버튼 눌렸을때
		bCancel.addActionListener(new ActionListener(){	//이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
			public void actionPerformed(ActionEvent e) {//액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
				clearTextField();						//입력창의 값을 null값으로 모두 비워줌.	
			}
		});

	}		//End eventProc()		

	void clearTextField() {
		/*
		 * 각각의 텍스트 필드와 텍스트 에어리어의 값을 지우기
		 */
		ta.setText(null);			//모든 창의 값을 0으로 만들어 놓기.
		tfname.setText(null);		//clear 버튼을 눌렀을 시 모든 값이 다 null이 된다.
		tfId.setText(null);
		tfAge.setText(null);
		tfGender.setText(null);
		tfHome.setText(null);
		tfTel.setText(null);
	}//end clearTextField()

	void getJuminInfo(){
		String in=tfId.getText();		//Id창에 입력한 텍스트를 받을 변수 설정
		if(in.length()<14) {			//String 길이가 14자를 넘어간다면 다시 입력하라고 말하기
			JOptionPane.showMessageDialog(bAdd, "-를 포함한 15자를 맞춰 입력해주세요.");
			return;						//다시 처음으로 돌아가기
		}//end if

		//1. 주민 번호의 7번째 문자로 성별을 구하여 성별창에 출력
		in.charAt(7);					//in 변수의 7번째 글자 따오기
		char ye=in.charAt(7);			//따온 7번째 글자를 저장할 char 변수 선언

		if(ye=='2'|ye=='4'|ye=='0') 	 tfGender.setText("여자");	//if문으로 2,4,0일때는 tfGender 창에 "여자" 를 입력한다.
		else if(ye=='1'|ye=='3'|ye=='9') tfGender.setText("남자");	//if문으로 1,3,9일때는 tfGender 창에 "남자" 를 입력한다.					
		else 						tfGender.setText("잘못 입력됨");	//if문으로 나머지일때는 tfGender 창에 "잘못 입력됨" 를 입력한다.

		//2. 주민 번호의 8번째 문자로 출신지를 구하여 출신지 창에 출력
		char chul=in.charAt(8);			//in 변수의 8번째 글자 따오기

		switch(chul) {	//문자,정수, 숫자열				//if문은 너무 복잡하고 길어지니 switch문으로 대체
		case '0': tfHome.setText("서울"); break;		//8번째 글자가 0일때 tfHome에 "서울" 출력 
		case '1': tfHome.setText("경기"); break;		//8번째 글자가 1일때 tfHome에 "경기" 출력
		case '2': tfHome.setText("인천"); break;		//8번째 글자가 2일때 tfHome에 "인천" 출력
		case '3': tfHome.setText("대구"); break;		//8번째 글자가 3일때 tfHome에 "대구" 출력
		case '4': tfHome.setText("대전"); break;		//8번째 글자가 4일때 tfHome에 "대전" 출력
		case '5': tfHome.setText("전주"); break;		//8번째 글자가 5일때 tfHome에 "전주" 출력
		case '6': tfHome.setText("울산"); break;		//8번째 글자가 6일때 tfHome에 "울산" 출력
		case '7': tfHome.setText("부산"); break;		//8번째 글자가 7일때 tfHome에 "부산" 출력
		case '8': tfHome.setText("독도"); break;		//8번째 글자가 8일때 tfHome에 "독도" 출력
		case '9': tfHome.setText("제주");			//마지막은 어차피 걸려서 나가니까 굳이 브레이크 걸지 않아도 됨
		}

		//3. 주민 번호에서 년도에 의해 나이를 구하여 나이창에 출력
		String nai=in.substring(0,2);			//in에서 0번째와 2번째 앞의 글자를 따온다. ex)"80"   >문자열
		int sunai=Integer.parseInt(nai);		//									ex) 80	>문자열을 숫자로 변경
		int age=0;								//최종 나이를 담을 변수 선언

		Calendar cal=Calendar.getInstance();	//변수 cal에 PC 캘린더를 Calendar클래스의 getInstance메소드를 가져옴
		int year=cal.get(Calendar.YEAR);		//변수 year에 pc캘린더의 년도를 인풋 받음
		if(ye=='3'|ye=='4') 	 age=year-(2000+sunai)+1;	//if문으로 3,4일때 age에 계산식을 넣는다.
		else if(ye=='1'|ye=='2') age=year-(1900+sunai)+1;	//if문으로 1,2일때 age에 계산식을 넣는다.
		else if(ye=='0'|ye=='9') age=year-(1800+sunai)+1;	//if문으로 0,9일때 age에 계산식을 넣는다.
		tfAge.setText(Integer.toString(age));				//tfAge에 텍스트 설정.(age는 int이므로 String으로 변환해서 넣어준다.)

		//JOptionPane.showMessageDialog(null, in);		//팝업 창 뜨면서 출력할 메세지 입력.(in : 입력받은 값)
	}//end getJuminInfo()

	void inputdata() {
		/*
		 * 'Add'버튼이 눌렸을 때 텍스트 필드에 입력한 사용자의 값들을 PersonVO에 저장하기
		 */
		//1 각각의 텍스트 필드의 입력값 얻어오기
		//2 1번 값들을 PersonVO 멤버변수에 저장(세터 or 생성자 이용)
		PersonVO ps=new PersonVO();						//생성자 초기화 및 선언하기
		ps.setName(tfname.getText());					//생성자 set함수 불러와서 설정할 값을 넣기
		ps.setId(tfId.getText());
		ps.setGender(tfGender.getText());
		ps.setHome(tfHome.getText());
		ps.setTel(tfTel.getText());
		ps.setAge(Integer.parseInt(tfAge.getText()));	//받을 값이 int이므로 string>int로 변환해주기

		list.add(ps);									//모든 set정보를 멤버변수 선언한 list배열에 저장	

	}//end inputdata()
	void selectAll() {
		/*
		 * 리스트에 저장된 정보를 모두 텍스트 에어리어에 출력
		 */
		ta.setText("-------전체 목록-------\n\n");	//가장 위에 제목 띄워놓고 버튼 누를때마다 초기화 방지
		//show를 눌렀을때 같은 값이 계속 나오는걸 방지하기 위해, +null값으로 넣으면 왜 있는지 헷갈리므로 제목 설정
		for(PersonVO vo:list) {						//향상된 for문으로 출력하기.
			ta.append(vo.toString());				//append : 원래 있는 텍스트는 그대로 두고 새 텍스트를 추가해주는 함수
		}											//setText : 원래 있는 텍스트를 초기화하고 새 텍스트를 추가해주는 함수
	}//End selectAll()
	void selectbyTel() {
		/*
		 * 함수명 : selectbyTel()
		 * 인자 : 없음
		 * 리턴값 : void
		 * 역할 : 
		 */
		//입력한 전화번호 값을 얻어오기
		String tel=tfTel.getText();
		//입력받은 전화번호가 공백이라면 메세지창을 출력
		if(tel.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");	//메세지창 출력
			return;														//전화번호를 입력하지 않으면 위의 메세지창을 띄우고 if문을 나가야함
		}
		//리스트에 저장된 PersonVO에 전화번호와 비교하여
		for (PersonVO ps: list) {							//향상된 for문으로 ps에 list 배열에 담기
			if(tel.equals(ps.getTel())) {					//입력한 tel값이 저장된 tel값과 같을 시
				tfname.setText(ps.getName());				//이름 텍스트필드에 저장된 이름 값을 출력한다.
				tfId.setText(ps.getId());					//이하동문
				tfHome.setText(ps.getHome());
				tfTel.setText(ps.getTel());
				tfGender.setText(ps.getGender());
				tfAge.setText(Integer.toString(ps.getAge()));//age는 int 값이므로 string으로 변환 해준다.
			}//End if
		}//End for
		//해당 전화번호가 있으면 그 내용을 텍스트필드에 출력

	}

	void deletebyTel() {
		//입력한 전화번호 값을 얻어오기
		String tel=tfTel.getText();
		//입력받은 전화번호가 공백이라면 메세지창을 출력
		if(tel.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");	//메세지창 출력
			return;														//전화번호를 입력하지 않으면 위의 메세지창을 띄우고 if문을 나가야함
		}//End if
		//List에 저장된 PersonVO의 전화번호와 비교하여
		for (PersonVO ps: list) {							//향상된 for문으로 ps에 list 배열에 담기
			if(ps.getTel().equals(tel)) {					//입력한 tel값이 저장된 tel값과 같을 시
				//해당 전화번호가 있으면 그 해당하는 PersonVO를 리스트에서 삭제
				list.remove(ps);							//방금 불러온 모든 PersonVO값을 원래의 메모리에서 삭제해준다.
				break;										//삭제 후 break;
				}//End if
			//참고 삭제하고 나서 break;로 반복문 끝내기
		}//End for
		
		
	}//End deletebyTel()

	public static void main(String[] args) {

		InfoView info=new InfoView();	//위의 페이지를 부를 변수 선언
		info.addLayout();				//레이아웃이 보이게 함수 선언
		info.eventProc();				//이벤트 

	}

}
