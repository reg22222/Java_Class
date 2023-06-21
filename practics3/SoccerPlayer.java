package practics3;

public class SoccerPlayer extends Person{
	String teamName;
	
	public void printInfo() {
		super.printInfo();
		System.out.println(name+"은 "+teamName+"팁 축구선수 입니다");
		
	}
}
