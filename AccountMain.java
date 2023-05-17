public class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account("김태회",101);
        a1.setBalance(8000);
        Account a2 = new Account("배수지",102,0);
        
        a1.printInfo();
        a2.printInfo();

        a1.withdraw(5000);
        a2.deposit(10000);
        a1.deposit(1000);
        a2.withdraw(7000);

        a1.printInfo();
        a2.printInfo();

        a1.withdraw(5000);
    }
}
