package day0620practice;

public class Cartoon extends Book2{
	boolean webtoon;
	
	public void printBook() {
		super.printBook();
		if(webtoon == true) {
			System.out.println("�� ��ȭ�� �����Դϴ�.");
		}else {
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�.");
		}
	}
}
