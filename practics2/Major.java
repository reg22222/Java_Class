package practics2;

public class Major extends Book{
	String subject;
	
	public void printBook() {
		super.printBook();
		System.out.println("전공분야는 "+subject+"입니다.");
	}

}
