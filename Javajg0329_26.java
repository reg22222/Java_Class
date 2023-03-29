public class Javajg0329_26 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("1-2+3-4+5-6+7-8+9-10=");
        for (int i = 0; i < 10; i++) {
            if(i%2==0) sum= sum -i;
            else sum+=i;
        }
        System.out.print(sum);
    }
}











