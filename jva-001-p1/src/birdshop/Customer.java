package birdshop;

import birdshop.drafts.ProductClientStorage;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Name {

    private List<ProductStorage> products;

    public Customer() {
        products = new ArrayList<>();
    }

    public List<ProductStorage> getProducts() {
        return products;
    }

    public void setProducts(List<ProductStorage> products) {
        this.products = products;
    }
}
