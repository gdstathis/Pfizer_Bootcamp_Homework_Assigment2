package JavafundamentalsExercises.Homework_2.Exersice1;

/**
 * @author Georgios Stathis
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("George", 120, 0, Category.BASIC);
        System.out.println("\n===============SIMPLE ACCOUNT TEST METHOD================\n");
        account.testerMethod();
        System.out.println("\n===============STORE ACCOUNT TEST METHOD================\n");
        StoreAccount storeAccount = new StoreAccount("Dimitrios", Category.PREMIUM);
        storeAccount.testerMethod();
    }


}
