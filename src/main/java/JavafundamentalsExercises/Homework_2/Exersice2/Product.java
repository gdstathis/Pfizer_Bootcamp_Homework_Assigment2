package JavafundamentalsExercises.Homework_2.Exersice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**Use lombok plugin for less code
 * All necessary details for class Product
 * */
public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;
}
