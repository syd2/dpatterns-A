
public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0.0);
            System.out.println("QuantityObserver set shipping cost to $0.");
        }
    }
}