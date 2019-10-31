package oop.method3;

import java.lang.*;

public class test1 {
	public static void main(String[] args) {

		/*
		 * 다음 정보를 데이터화하여 출력
		 * 
		 * 메뉴판 정보
		 * 
		 * 이름 : 아메리카노 , 가격 : 1800 , 종류 : 음료 , 행사상품 이름 : 프라푸치노 , 가격 : 3500 , 종류 : 음료 ,
		 * 행사상품 아님 이름 : 파니니 , 가격 : 2800 , 종류 : 식사 , 행사상품 이름 : 크로크무슈 , 가격 : 3300 , 종류 :
		 * 식사 , 행사상품 아님
		 * 
		 * 행사상품은 10% 할인된 가격으로 판매합니다.
		 * 
		 * 언제든지 행사여부는 변경이 가능합니다.
		 */
// 	생성
		coffee a = new coffee();
		coffee b = new coffee();
		coffee c = new coffee();
		coffee d = new coffee();

//	초기화	
		a.cof("아메리카노", 1800, "음료", 10);
		b.cof("프라푸치노", 3500, "음료", 0);
		c.cof("파니니", 2800, "식사", 10);
		d.cof("크로크무슈", 3300, "식사", 0);
// 	출력
		a.print();
		b.print();
		c.print();
		d.print();
	}

}