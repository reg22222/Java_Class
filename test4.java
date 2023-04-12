import java.util.*;

import javax.sound.midi.Synthesizer;
public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = new String[2];
        int[][] score = new int[2][3];
        int sum;
        double avg;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("학생"+(i+1)+ "이름 입력 : ");
            name[i] = in.next();
            for (int j = 0; j < 3; j++) {
                System.out.println("성적"+(j+1)+" 입력 : ");
                score[i][j] = in.nextInt();
            }
            
        }
        System.out.println("***************입력완료***************");

        for (int i = 0; i < 2; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) 
                sum = sum + score[i][j];
            System.out.println(name[i]+"학생의 총점은"+sum+"점이고,");
            avg = sum / 3.0;
            System.out.printf("평균은 %f점 입니다.\n",avg);

            if(avg>=90){
                System.out.println(name[i]+"학생의 학점은 A입니다.");
            }
            else if(avg >= 80){
                System.out.println(name[i]+"학생의 학점은 B입니다.");
            }
            else if(avg >= 70){
                System.out.println(name[i]+"학생의 학점은 C입니다.");
            }
            else if(avg >= 60){
                System.out.println(name[i]+"학생의 학점은 D입니다.");
            }
            else
            {
                System.out.println(name[i]+"학생의 학점은 F입니다.");
            }
            
        }
        

    }
}
