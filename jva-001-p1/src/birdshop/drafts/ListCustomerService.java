//package birdshop;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListCustomerService implements CustomerService<Customer> {
//
//    private List<Customer> customers;
//
//    public ListCustomerService() {
//        customers = new ArrayList<>();
//    }
//
//    @Override
//    public void addItem(Customer item) {
//        customers.add(item);
//    }
//
//    @Override
//    public void removeItem(Customer item) {
//        customers.remove(item);
//    }
//
//    @Override
//    public Customer find(String name) {
//        for (Customer customer : customers) {
//            if(customer.getName().equals(name)){
//                return customer;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Customer> findAll() {
//        return customers;
//    }
//
//
//
//}
