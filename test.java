import java.util.*;

public class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("정수 5개를 입력해주세요:");
        int max = 0;
        int i = 0;

        while(i < num.length){
            System.out.println(i+1+"번째 정수");
            num[i] = in.nextInt();
            
            if(max < num[i]){
                max = num[i];
            }
            i++;
        }


        System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");
        
        
        
        
    }
}