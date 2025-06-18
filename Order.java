
import java.util.List;

public class Order {
    private String id;
    private int    itemCount;
    private double itemCost;
    private double shippingCost;
    private double discount;
    private List<OrderObserver> observers;

    public Order(String id) {

    }

    public void registerObserver(OrderObserver o) { }
    public void removeObserver(OrderObserver o) { }
    public void notifyObservers() { }

    public void addItem(double price) { }

    // getters only
    public int    getItemCount()     { return 0; }
    public double getItemCost()      { return 0; }
    public double getShippingCost()  { return 0; }
    public double getDiscount()      { return 0; }
    public double getTotalCost()     { return 0; }
}