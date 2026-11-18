public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(AccountType.SAVINGS);
        Account a2 = new Account(AccountType.CREDIT);
        Account a3 = new Account(AccountType.DEPOSIT);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\nSemua tipe account:");

        for (AccountType type : AccountType.values()) {
            System.out.println(type);
        }
    }
}