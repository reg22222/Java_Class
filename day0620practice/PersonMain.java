package day0620practice;

public class PersonMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		SoccerPlayer s2 = new SoccerPlayer();
		
		s1.name = "������";
		s1.age = 23;
		s1.online = true;
		s1.printInfo();
		
		s2.name = "���ڰ�";
		s2.age = 28;
		s2.teamName = "����FC";
		s2.printInfo();
	}
}
