public class Tables implements Furniture {
    private double weight;
    private double length;
    private double width;

    public Tables(double weight, double length, double width) {
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
