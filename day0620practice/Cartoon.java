package day0620practice;

public class Cartoon extends Book2{
	boolean webtoon;
	
	public void printBook() {
		super.printBook();
		if(webtoon == true) {
			System.out.println("이 만화는 웹툰입니다.");
		}else {
			System.out.println("이 만화는 웹툰이 아닙니다.");
		}
	}
}
