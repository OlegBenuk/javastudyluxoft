package birdshop;

import java.time.LocalDateTime;

public class ProductStorage extends Name{
    private int amount;
    private String largeType;
    private double price;
    private double purchase;
    private int itemsSold;
    private LocalDateTime boughtDateTime;

    public ProductStorage() {
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getLargeType() {
        return largeType;
    }

    public void setLargeType(String largeType) {
        this.largeType = largeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public LocalDateTime getBoughtDateTime() {
        return boughtDateTime;
    }

    public void setBoughtDateTime(LocalDateTime boughtDateTime) {
        this.boughtDateTime = boughtDateTime;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }
}
