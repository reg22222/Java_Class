public class StudentExam {
    public static void main(String[] args) {
        Student kim = new Student();
        kim.setName("김현우");
        kim.setGrade(2);

        Student jang = new Student();
        jang.setName("장민재");
        jang.setGrade(3);

        kim.print();
        jang.print();
    }
}
