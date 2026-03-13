public interface ShippingVisitor {
    void visit(Chairs chair);
    void visit(Tables table);
    void visit(Sofas sofa);
}
