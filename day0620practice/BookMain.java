package day0620practice;

public class BookMain {
	public static void main(String[] args) {
		System.out.println(Book.getLibrary()+"�� ���� ������"+Book.getBookCnt()+"�� �Դϴ�.");
		System.out.println("******************************************************");
		Book b1 = new Book();
		b1.setNo(100);
		b1.setName("������");
		b1.setCount(10);
		Book b2 = new Book(101, "���ڼ�����");
		b2.setCount(5);
		Book b3 = new Book(102, "��������", 15);
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
		System.out.println("**********************************************************");
		System.out.println(Book.getLibrary()+"�� ���� ������"+Book.getBookCnt()+"�� �Դϴ�.");
		System.out.println("*********************************************************************");
		
		b1.borrowBook(15);
        b2.returnBook(2);
        b1.borrowBook(5);
        b3.borrowBook(10);
        b3.returnBook(5);
		System.out.println("*****************************************************************");
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
	}
}
