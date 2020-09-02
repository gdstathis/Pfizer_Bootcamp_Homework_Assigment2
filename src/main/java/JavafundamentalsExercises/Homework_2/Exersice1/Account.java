package JavafundamentalsExercises.Homework_2.Exersice1;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    /*Basic details for account*/
    private String Owner;
    private double balance;
    private int numberOfTransactions;
    private Category category;


    /**
     * This method accepted as argument a possitive value of withdrawAmmount and
     * then deduct it from the account
     *
     * @param withdrawAmount
     * @return true if withdraw has been succeed or false if balance of account is
     * lower than the amount of withdraw
     */
    public boolean withdraw(double withdrawAmount) {
        if (balance > withdrawAmount) {
            this.balance -= withdrawAmount;
            this.numberOfTransactions++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method accepted as argument a possitive value of withdrawAmmount and
     * then deduct it from the account
     *
     * @param depositAmount
     * @return true if deposit has been succeed or false if the amount of deposit
     * has got negative value
     */
    public boolean deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            this.numberOfTransactions++;
            return true;
        }
        return false;
    }

    public void testerMethod() {
        System.out.println("The owner name of created account is " + this.getOwner() + "has "
                + this.getBalance() + " euros and its category is " + this.getCategory());
        this.setCategory(Category.PREMIUM);
        this.setOwner("Georgios");
        System.out.println("The new name of owner account after update is " + this.getOwner() +
                "has " + this.getBalance() + " euros and its new category is "
                + this.getCategory());
        System.out.println("Add 100 euros into account" + this.deposit(100));
        System.out.println("The new balance is " + this.getBalance());
        System.out.println("Now deposit 200 euros from account " + this.deposit(200));
        System.out.println("The new balance is " + this.getBalance());
        System.out.println("Now try to widthdrow 1000 from the account" + this.withdraw(1000));

        System.out.println("The new balance is " + this.getBalance()
                + " because deposit amount is greater than balance");
        System.out.println("Now try to widthdrow 250 from the account" + this.withdraw(250));
        System.out.println("The new balance is " + this.getBalance());
        System.out.println("The nnumber of transactions is " + this.getNumberOfTransactions());

    }

}
