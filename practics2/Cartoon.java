package practics2;

public class Cartoon extends Book{
	boolean webtoon;
	
	public void printBook() {
		if(webtoon == true) {
			super.printBook();
			System.out.println("이 만화는 웹툰입니다.");
		}else {
			super.printBook();
			System.out.println("이 만화는 웹툰이 아닙니다.");
		}
	}
}
