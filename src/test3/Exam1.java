package test3;

public class Exam1 {

	private String name;
	private int kuk;
	private int eng;
	private int su;
	private int total;
	private double ave;   // ��������� �Ҽ����� ���� �� �־� ����� ǥ��
	
	
//�ޱ�	
	void setName(String name) { // ������� �̸�
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setKuk(int kuk) {  // ������� ���� ����
		this.kuk = kuk;
	}
	
	int getKuk() {
		return kuk;
	}
	
	void setEng(int eng) {  // ������� ��������
		this.eng = eng;
	}
	
	int getEng() {
		return eng;
	}
	
	void setSu(int su) {  // ������� ��������
		this.su = su;
	}
	
	int getSu() {
		return su;
	}
	
	void setTotal(int total) {  // ������� ������
		this.total = total;
	}
	
	int getTotal() {
		return total;
	}
	
	void setAve(double ave) {   // ������� ���
		this.ave = (double) ave;  
	}
	
	double getAve() {
		return ave;
		
	}
	
	// ����� �ۼ� 
	
	void set(String name, int kuk,int eng ,int su) {
	this.setName(name);
	this.setKuk(myexam(kuk));
	this.setEng(myexam(eng));
	this.setSu(myexam(su));
	this.setTotal(getKuk()+getEng()+getSu());
	this.setAve(getTotal() / 3);
		
		
	}
	int myexam (int total) {  // �ۼ����� ���� �� �� �ֱ� ����  �ܺη� ������ �ϱ�   
		if(total > 0 && total <= 100) {    // 0���̻� 100�����ϸ� ��µǰ� �ϱ� ����  if�� ���
			return total;
		}
		else {
			return 1;
		}
	}
	
	
	void print() {
		System.out.println("�̸� :"+getName());
		System.out.println("����  :"+getKuk());
		System.out.println("���� :"+getEng());
		System.out.println("���� :"+getSu());
		System.out.println("���� :"+getTotal());
		
		if (getAve() < 60) {        // �հݰ� ���հ��� ǥ���ϱ� ���� if�� ���
			 System.out.println("��� :"+ getAve()+ " ���հ�.");
		}
		else {
			System.out.println("��� :"+ getAve() + "�հ�.");
		}
		
	}
	
	
}