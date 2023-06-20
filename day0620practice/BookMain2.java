package day0620practice;

public class BookMain2 {
	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		Major m1 = new Major();
		
		c1.title = "순정만화";
		c1.writer = "강풀";
		c1.webtoon = true;
		c1.printBook();
		
		m1.title = "자바의 정석";
		m1.writer = "남궁성";
		m1.subject = "프로그래밍";
		m1.printBook();
	}

}
