package day0620practice;

public class Student extends Person{
	boolean online;
	
	public void printInfo() {
		if( online == true) {
			super.printInfo();
			System.out.println(name+"�� �л��̸� ���� �¶��� ���� ���Դϴ�.");
		}else {
			super.printInfo();
			System.out.println(name+"�� �л��̸� ���� � �������Դϴ�.");
		}
	}
}
