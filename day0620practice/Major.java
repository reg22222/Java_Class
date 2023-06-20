package day0620practice;

public class Major extends Book2{
	String subject;
	
	public void printBook() {
		super.printBook();
		System.out.println("전공 분야는 "+subject+"입니다.");
	}
}
