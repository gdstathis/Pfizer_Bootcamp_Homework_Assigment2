package JavafundamentalsExercises.Homework_2.Exersice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * Use lombok for less code
 * Calculate the totalBuyBalance and totalSellBalance and return Revenue*/
public class SimpleRetailStore implements IStore {
    private double totalBuyBalance;
    private double totalSellBalance;
    private double revenue;


    @Override
    public void buy(Product product) {
        this.totalBuyBalance -= product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        this.totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return this.totalSellBalance - totalBuyBalance;
    }
}
