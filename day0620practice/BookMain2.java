package day0620practice;

public class BookMain2 {
	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		Major m1 = new Major();
		
		c1.title = "������ȭ";
		c1.writer = "��Ǯ";
		c1.webtoon = true;
		c1.printBook();
		
		m1.title = "�ڹ��� ����";
		m1.writer = "���ü�";
		m1.subject = "���α׷���";
		m1.printBook();
	}

}
