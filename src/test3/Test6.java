package test3;

public class Test6 {
public static void main(String[] args) {
	
	Exam1 a = new Exam1();
	Exam1 b = new Exam1();
	Exam1 c = new Exam1();

	
// 학생 데이터값 입력	
	a.set("david",20,20,85);
	b.set("ronaldo",91,53,77);
	c.set("messi",66,89,75);
	
//	학생 출력
	a.print();
	b.print();
	c.print();
	
	
} 
}
