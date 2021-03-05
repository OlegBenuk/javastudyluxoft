package birdshop;

import java.util.List;

public class Transaction {

    private Customer customer;
    private List<ProductStorage> products;
    private double totalPrice;

    public Transaction() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductStorage> getProducts() {
        return products;
    }

    public void setProducts(List<ProductStorage> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
