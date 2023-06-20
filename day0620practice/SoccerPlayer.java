package day0620practice;

public class SoccerPlayer extends Person{
	String teamName;
	
	public void printInfo() {
		super.printInfo();
		System.out.println(name+"은(는)"+ teamName+"팀 축구선수 입니다.");
	}
}
