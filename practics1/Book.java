package practics1;

public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private static final String Library = "로봇도서관";
	private static int BookCnt=0;
	
	public Book() {
		BookCnt++;
	}
	public Book(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}
	public Book(int no, String name, int count) {
		this(no, name);
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBorrow() {
		return borrow;
	}
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	public static int getBookCnt() {
		return BookCnt;
	}
	public static void setBookCnt(int bookCnt) {
		BookCnt = bookCnt;
	}
	public static String getLibrary() {
		return Library;
	}
	
	public void printInfo() {
		System.out.println("번호:"+no+"도서명"+name+"도서개수"+count+"대여개수"+borrow);
		
	}
	public void borrowBook(int cnt) {
		if(count < cnt) {
			System.out.println(no+"번 도서 "+cnt+"권 대출 실패");
		}else {
			count-=cnt;
			borrow+=cnt;
			System.out.println(no+"번 도서"+cnt+"권 대출 성공");
		}
	}
	public void returnBook(int cnt) {
		if(borrow < cnt) {
			System.out.println(no+"번 도서 "+cnt+"권 반납 실패");
		}else {
			count+=cnt;
			borrow-=cnt;
			System.out.println(no+"번 도서"+cnt+"권 반납 성공");
		}
	}
}
