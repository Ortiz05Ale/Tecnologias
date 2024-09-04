package DiegoRafa;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100,"Ale","current");
        System.out.println(account.calculateInterest());
    }
}
