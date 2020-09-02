package JavafundamentalsExercises.Homework_2.Exersice1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**The implementation subclass StoreAccount using as base the class Account*/
public class StoreAccount extends Account {
    private String storeName;
    private Category accountCategory;

    public void changeCategory(Category category) {
        this.accountCategory = category;
    }

    public void testerMethod() {
        System.out.println("The new store account has details" + "store name"
                + this.getStoreName() + "category" + this.accountCategory);
        this.setBalance(250);
        this.setOwner("Dimitris ");
        System.out.println("The full details of store account are\n" + "\n"
                + this.getStoreName() + "\n" + this.getOwner() + "\n" + this.getBalance()
                + "\n" + this.getAccountCategory() + "\n" + this.getNumberOfTransactions());
        changeCategory(Category.MID);
        this.deposit(250);
        this.withdraw(250);
        System.out.println("The balance is" + this.getBalance()
                + "and the number of transactions is" + getNumberOfTransactions());
    }

}