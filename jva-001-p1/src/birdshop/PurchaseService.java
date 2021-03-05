package birdshop;

public interface PurchaseService {
    void sellItem(String name, String item, int amount);

    public void setProductService(CRUDService<ProductStorage> productService) ;

    public void setCustomerService(CRUDService<Customer> customerService);
}
