package JavafundamentalsExercises.Homework_2.Exersice2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
/**
 * InventoryRetailStore extends SimpleRetailStore which implements IStore interface
 * Add a product from Inventory list  when is purchased or remove from Inventory list
 * when sold. Also calculate every time the buyBalance and sellBalance and then return Revenue
 * */
public class InventoryRetailStore extends SimpleRetailStore {
    private List<Product> Inventory;
    private double buyBalance;
    private double sellBalance;

    InventoryRetailStore() {
        Inventory = new ArrayList<>();
    }

    @Override
    public void buy(Product product) {
        Inventory.add(product);
        this.buyBalance -= product.getPriceWhenBuy();

    }

    @Override
    public void sell(Product product) {
        Inventory.remove(product);
        this.sellBalance += product.getPriceWhenSell();
    }

    public List<Product> getInventory() {
        return Inventory;
    }

    public void reset() {
        Inventory.clear();
    }

    public double getRevenue() {
        return this.sellBalance + this.buyBalance;
    }

}
