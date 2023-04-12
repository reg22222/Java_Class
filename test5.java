import java.util.*;

class A01{
    int sum;
    public A01(){
        sum = 0;
    }
    public void disp(int num){
        for (int i = 1; i <= num; i++) {
            if(i % 2 ==0)
            {
                System.out.print("-"+i);
                sum -= i;
            }
            else{
                System.out.print("+"+i);
                sum += i;
            }
        }
        System.out.print(" = " + sum);
    }
}
public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A01 ap = new A01();
        System.out.println("숫자입력 : ");
        int n = in.nextInt();
        ap.disp(n);
    }
}