package birdshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListPurchaseService implements PurchaseService{
    List<Transaction> transactions;
    CRUDService<ProductStorage> productService;
    CRUDService<Customer> customerService;

    public ListPurchaseService() {
        transactions = new ArrayList<>();
    }

    @Override
    public void sellItem(String name, String item, int amount) {
        ProductStorage productStorage = checkSellingItem(item, amount);
        if(productStorage!=null){
            removeFromShop(amount, productStorage);
            addItemToCustomer(name, amount, productStorage);
        }
    }


    private void addItemToCustomer(String name, int amount, ProductStorage productStorage) {
        Customer customer = customerService.find(name);
        if(customer==null){
            customer = new Customer();
            customer.setName(name);
            customerService.addItem(customer);
        }

        productStorage.setAmount(amount);
        productStorage.setItemsSold(-1);
        productStorage.setBoughtDateTime(LocalDateTime.now());

        customer.getProducts().add(productStorage);
    }

    private void removeFromShop(int soldAmount, ProductStorage productStorage) {
        productStorage.setAmount(productStorage.getAmount() - soldAmount);
        productStorage.setItemsSold(productStorage.getItemsSold()+soldAmount);
    }


    private ProductStorage checkSellingItem(String item, int amount) {
        ProductStorage productStorage = findItem(item);
        if(productStorage!=null && hasAmount(item, amount, productStorage.getAmount())){
            return productStorage;
        }
        return null;
    }


    private ProductStorage findItem(String item){
        for (ProductStorage productStorage : productService.findAll()) {
            if(productStorage.getName().equals(item)){
                return productStorage;
            }
        }
        return null;
    }

    private boolean hasAmount(String item, int needAmount, int hasAmount){
        if(needAmount > hasAmount){
            System.out.println("You can buy only "+ hasAmount +" "+item);
            return false;
        }
        return true;
    }



    public void setProductService(CRUDService<ProductStorage> productService) {
        this.productService = productService;
    }



    public void setCustomerService(CRUDService<Customer> customerService) {
        this.customerService = customerService;
    }
}
