package ch04;

class OTT {
	String name;
	int price;
	
	public void show() {
		System.out.println(name + "의 이용료는 월 " + price + "원");
	}
}

public class LabOttExample {
	public static void main(String[] args) {
		OTT netflix = new OTT ();
		OTT tving = new OTT ();
		
		netflix.name = "Netflix";
		netflix.price = 13500;
		
		tving.name = "TVING";
		tving.price = 7900;
		
		netflix.show();
		tving.show();
	}




	

}
