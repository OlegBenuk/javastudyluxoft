package birdshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private CRUDService<ProductStorage> productService;
    private CRUDService<Customer> customerService;

    private PurchaseService purchaseService;


    public Shop() {

        productService = new CRUDServiceImpl<>();
        customerService = new CRUDServiceImpl<>();
        purchaseService = new ListPurchaseService();
        purchaseServiceInit();
    }

    private void purchaseServiceInit() {
        purchaseService.setProductService(productService);
        purchaseService.setCustomerService(customerService);
    }


//    public void sellItem(String name, String item, int amount){
//        productService.se
//    }

    public void sellItem(String name, String item, int amount){
        purchaseService.sellItem(name, item,amount);
    }

    public void addItem(ProductStorage item) {
        productService.addItem(item);
    }

    private void addCustomer(Customer customer) {
        customerService.addItem(customer);
    }


    public CRUDService<ProductStorage> getProductService() {
        return productService;
    }

    public void setProductService(CRUDService<ProductStorage> productService) {
        this.productService = productService;
    }

    public CRUDService<Customer> getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CRUDService<Customer> customerService) {
        this.customerService = customerService;
    }

    public void print(){
        System.out.printf("|%-10s|%-10s|%-12s|%-10s|%-10s|%-10s|%-17s|%n","customer", "type", "sold_count", "price", "income","profit","time");
        System.out.println("---------------------------------------------------------------------------------------");

        double income;
        double profit;

        for (Customer customer : getCustomerService().findAll()) {
            System.out.printf("|%-10s%n",customer.getName());
            for (ProductStorage product : customer.getProducts()) {
                income = product.getAmount()*product.getPrice();
                profit = product.getAmount()*(product.getPrice() - product.getPurchase());
                System.out.printf("|%-10s|%-10s|%-12s|%-10s|%10.2f|%10.2f|","",product.getName(),product.getAmount(),product.getPrice(),income,profit );
                System.out.println("   "+ DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(product.getBoughtDateTime())+"|");

            }
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }
}
