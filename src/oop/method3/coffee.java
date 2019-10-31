package oop.method3;

public class coffee {


	String menu;
	int price;
	String type;
	int event;

	void cof(String menu, int price, String type, int event) {
		this.menu = menu;
		this.price = price;
		this.type = type;
		this.event = event;
	}

	void print() {

		System.out.println("메뉴 : " + this.menu);

		if (event == 10) {
			System.out.println("가격 : " + this.price * 0.9);
		} else if (event < 10) {
			System.out.println("가격 : " + this.price);
		}

		System.out.println("종류 : " + this.type);

		if (event == 10) {
			System.out.println("행사상품 할인 : " + this.event + "%");
		} else if (event < 10) {
			System.out.println("행사상품아님");
		}

	}
}
