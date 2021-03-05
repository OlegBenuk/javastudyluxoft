//package birdshop;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListProductService implements ProductService<ProductStorage> {
//
//    private List<ProductStorage> products;
//
//    public ListProductService() {
//        products = new ArrayList<>();
//    }
//
//    @Override
//    public void addItem(ProductStorage item) {
//        products.add(item);
//    }
//
//    @Override
//    public void removeItem(ProductStorage item) {
//        products.remove(item);
//    }
//
//    @Override
//    public ProductStorage find(String name) {
//        for (ProductStorage product : products) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<ProductStorage> findAll() {
//        return products;
//    }
//
//
//
//
//}
