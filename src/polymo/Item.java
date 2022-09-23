package polymo;

abstract public class Item {
	
	protected String number;
	protected String title;
	
	public Item(){
		this("0", "이름없음");
	}
	
	public Item(String number, String title){
		this.number=number;
		this.title=title;
	}
	
	abstract public void output();

}
