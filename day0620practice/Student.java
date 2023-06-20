package day0620practice;

public class Student extends Person{
	boolean online;
	
	public void printInfo() {
		if( online == true) {
			super.printInfo();
			System.out.println(name+"은 학생이며 현재 온라인 수업 중입니다.");
		}else {
			super.printInfo();
			System.out.println(name+"은 학생이며 현재 등교 수업중입니다.");
		}
	}
}
