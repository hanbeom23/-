package ch04;

class Donut {
	int price;
	
	Donut(){
		System.out.println("Donut 객체가 생성되었습니다.");
	}
	
	public void show() {
		System.out.println(price + "원입니다.");
	}
}

public class DonutExample {
	public static void main(String[] args) {
		Donut d1 = new Donut ();
		Donut d2 = new Donut ();
		
		d1.price = 2000;
		d2.price = 3000;
		
		d1.show();
		d2.show();
	}

}
