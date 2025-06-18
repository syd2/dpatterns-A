public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalCost() > 200.0) {
            order.applyDiscount(20.0);
            System.out.println("PriceObserver applied $20 discount. New total: " + order.getTotalCost());
        }
    }
}