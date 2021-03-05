package birdshop.drafts;

import birdshop.ProductStorage;

import java.time.LocalDateTime;

public class ProductClientStorage extends ProductStorage {
    private double price;
    private LocalDateTime boughtDateTime;

    public ProductClientStorage() {
    }

    public LocalDateTime getBoughtDateTime() {
        return boughtDateTime;
    }

    public void setBoughtDateTime(LocalDateTime boughtDateTime) {
        this.boughtDateTime = boughtDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
