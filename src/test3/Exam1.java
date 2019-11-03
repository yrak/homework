package test3;

public class Exam1 {

	private String name;
	private int kuk;
	private int eng;
	private int su;
	private int total;
	private double ave;   // 평균점수는 소수점도 나올 수 있어 더블로 표현
	
	
//받기	
	void setName(String name) { // 사용자의 이름
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setKuk(int kuk) {  // 사용자의 국어 점수
		this.kuk = kuk;
	}
	
	int getKuk() {
		return kuk;
	}
	
	void setEng(int eng) {  // 사용자의 영어점수
		this.eng = eng;
	}
	
	int getEng() {
		return eng;
	}
	
	void setSu(int su) {  // 사용자의 수학점수
		this.su = su;
	}
	
	int getSu() {
		return su;
	}
	
	void setTotal(int total) {  // 사용자의 총점수
		this.total = total;
	}
	
	int getTotal() {
		return total;
	}
	
	void setAve(double ave) {   // 사용자의 평균
		this.ave = (double) ave;  
	}
	
	double getAve() {
		return ave;
		
	}
	
	// 사용자 작성 
	
	void set(String name, int kuk,int eng ,int su) {
	this.setName(name);
	this.setKuk(myexam(kuk));
	this.setEng(myexam(eng));
	this.setSu(myexam(su));
	this.setTotal(getKuk()+getEng()+getSu());
	this.setAve(getTotal() / 3);
		
		
	}
	int myexam (int total) {  // 작성란에 적용 할 수 있기 위해  외부로 빠지게 하기   
		if(total > 0 && total <= 100) {    // 0점이상 100점이하만 출력되게 하기 위해  if문 사용
			return total;
		}
		else {
			return 1;
		}
	}
	
	
	void print() {
		System.out.println("이름 :"+getName());
		System.out.println("국어  :"+getKuk());
		System.out.println("영어 :"+getEng());
		System.out.println("수학 :"+getSu());
		System.out.println("총점 :"+getTotal());
		
		if (getAve() < 60) {        // 합격과 불합격을 표현하기 위해 if문 사용
			 System.out.println("평균 :"+ getAve()+ " 불합격.");
		}
		else {
			System.out.println("평균 :"+ getAve() + "합격.");
		}
		
	}
	
	
}