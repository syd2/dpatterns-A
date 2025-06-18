public class Client {
    public static void main(String[] args) {
        Order order = new Order("ORD-1001");

        PriceObserver    priceObs    = new PriceObserver();
        QuantityObserver quantityObs = new QuantityObserver();

        order.registerObserver(priceObs);
        order.registerObserver(quantityObs);

        // Simulate adding items
        double[] prices = { 30, 50, 40, 60, 20, 15 };
        for (double p : prices) {
            order.addItem(p);
            System.out.println("Added item $" + p +
                               " => total=" + order.getTotalCost() +
                               ", items=" + order.getItemCount() +
                               ", shipping=" + order.getShippingCost());
        }
    }
}