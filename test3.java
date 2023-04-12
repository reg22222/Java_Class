import java.util.*;
public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 0;
        int d = 0;
        
        System.out.println("달 입력 :");
        m = in.nextInt();

        switch(m){
           case 1: case 3: case 5: case 7: case 8: case 10: case 12: d = 31; break;
           case 4: case 6: case 9: case 11: d = 30; break;
           case 2: d = 28; break;
           default:
        }
        
        System.out.println(m+"월은 "+d+"일입니다.");


    }
}
