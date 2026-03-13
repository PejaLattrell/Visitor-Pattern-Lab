public class ShippingCostCalculator implements ShippingVisitor {
    private double totalCost = 0;

    @Override
    public void visit(Chairs chair) {
        // Flat rate for chairs + some weight factor
        double cost = 15.0 + (chair.getWeight() * 0.5);
        System.out.println("Shipping cost for Chairs (Weight: " + chair.getWeight() + "kg): $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    @Override
    public void visit(Tables table) {
        // Cost based on dimensions and weight
        double area = table.getLength() * table.getWidth();
        double cost = (area * 0.01) + (table.getWeight() * 0.8);
        System.out.println("Shipping cost for Tables (Dimensions: " + table.getLength() + "x" + table.getWidth() + "cm, Weight: " + table.getWeight() + "kg): $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    @Override
    public void visit(Sofas sofa) {
        // Cost based on distance and weight
        double cost = (sofa.getDistance() * 1.5) + (sofa.getWeight() * 1.2);
        System.out.println("Shipping cost for Sofas (Distance: " + sofa.getDistance() + " miles, Weight: " + sofa.getWeight() + "kg): $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
