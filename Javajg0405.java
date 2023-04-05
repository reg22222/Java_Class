public class Javajg0405 {
    public static void main(String[] args){
        /* 
        int  i = 1;
        while(i < 6){
            System.out.print(i+"\t");
            i++;
            int  i = 1, sum = 0;
            System.out.print("1-2+3-4+5-6+7-8+9-10");
        }
        while(i <=10){
            if(i%2 == 0) sum-=i;
            else sum+=i;
            i++;
        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
            if(i==5)break;
        System.out.println(i+"\t");
    }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"\t");
            if(i==5)break;
        }*/
        
        for (int i = 1; i <= 10; i++) {
            if(i==5) continue;
            System.out.print(i+"\t");
        }
    }         
}
