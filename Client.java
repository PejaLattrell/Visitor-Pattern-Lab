import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        
        List<Furniture> items = new ArrayList<>();
        
        
        items.add(new Chairs(12.5)); 
        items.add(new Tables(45.0, 120.0, 80.0)); 
        items.add(new Sofas(150.0, 35.0)); 

        
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        System.out.println("Calculating shipping costs for furniture order:");
        System.out.println("-------------------------------------------------");

        
        for (Furniture item : items) {
            item.accept(calculator);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Total Shipping Cost: $" + String.format("%.2f", calculator.getTotalCost()));
    }
}
