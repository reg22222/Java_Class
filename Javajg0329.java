import java.util.*;
public class Javajg0329{
    public static void main(String[] args) {
        /*
         int a = 10;
        if(a%2==0)
            System.out.println(a+"은(는) 짝수입니다.");
        else
            System.out.println(a+"은(는) 홀수입니다.");
        
        
        int a = 20, b = 10;
        char op = '*';

        if(op == '+'){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if(op == '-'){
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if(op == '*'){
            System.out.println(a+"*"+b+"="+(a*b));
        }
        else if(op == '/'){
            System.out.println(a+"/"+b+"="+(a/b));
        }
        else{
            System.out.println("사칙연산자가 아닙니다.");
        }
        int a = 10;
        if(a) System.out.println(a+"는 0이 아닙니다.");
        else System.out.println(a+"는 0입니다.");

        int a = 20, b = 10;
        char op = '*';

        switch(op){
            case '+': System.out.println(a+"+"+b+"="+(a+b));
                
            case '-': System.out.println(a+"-"+b+"="+(a-b));
                
            case '*': System.out.println(a+"*"+b+"="+(a*b));
                
            case '/': System.out.println(a+"/"+b+"="+(a/b));
                
            default: System.out.println("사칙연산이 아닙니다.");

            int a = 7;
            switch(a % 3){
                case 0 : System.out.println(a+"은(눈) 3의 배수입니다.");
                    break;
                case 1:
                case 2 : System.out.println(a+"은(는) 3의 배수가 아닙니다.");
                    break;
            }
        Scanner in = new Scanner(System.in);
        System.out.println("달 입력 : ");
        int a = in.nextInt();
        int day;
        switch(a){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31; break;
            case 4: case 6: case 9: case 11:
                day = 30; break;
            default: day = 28;
        }
        
        System.out.println(a+"월은"+day+"일입니다.");*/
        
        int even_sum = 0,odd_sum = 0;
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                even_sum+=i;
            }
            else{
                odd_sum+=i;
            }
        }
        System.out.println("1뷰토 10까지의 짝수 합은"+even_sum+"이고, 홀수합은"+odd_sum+"입니다.");
        
    }
}
