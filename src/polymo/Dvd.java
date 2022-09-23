package polymo;

public class Dvd extends Item {
	
	String who;
	String flim;

	Dvd(){
		this("0", "알수없음", "무명", "무명감독");
	} 
	
	Dvd (String number, String title, String who, String flim){
		super(number,title);
		this.who=who;
		this.flim=flim;
	}
	
	public void output() {
		System.out.println(number+","+title+","+who+","+flim);
	}

}
