
import java.util.List;

import java.util.ArrayList;

public class Order {
    private String                id;
    private int                   itemCount    = 0;
    private double                itemCost     = 0.0;
    private double                shippingCost = 10.0;  // default
    private double                discount     = 0.0;
    private List<OrderObserver>   observers    = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void registerObserver(OrderObserver o) {
        observers.add(o);
    }
    public void removeObserver(OrderObserver o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (OrderObserver o : observers) {
            o.update(this);
        }
    }

    public void addItem(double price) {
        itemCount++;
        itemCost += price;
        notifyObservers();
    }

    public int    getItemCount()    { return itemCount; }
    public double getItemCost()     { return itemCost; }
    public double getShippingCost() { return shippingCost; }
    public double getDiscount()     { return discount; }
    public double getTotalCost()    { return itemCost + shippingCost - discount; }

    // internal hooks for observers
    void applyDiscount(double amount)   { discount = amount; }
    void setShippingCost(double cost)   { shippingCost = cost; }
}

