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

		System.out.println("�޴� : " + this.menu);

		if (event == 10) {
			System.out.println("���� : " + this.price * 0.9);
		} else if (event < 10) {
			System.out.println("���� : " + this.price);
		}

		System.out.println("���� : " + this.type);

		if (event == 10) {
			System.out.println("����ǰ ���� : " + this.event + "%");
		} else if (event < 10) {
			System.out.println("����ǰ�ƴ�");
		}

	}
}
