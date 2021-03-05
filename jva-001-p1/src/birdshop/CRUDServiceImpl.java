package birdshop;

import java.util.ArrayList;
import java.util.List;

public class CRUDServiceImpl<T extends Name> implements CRUDService<T>{


    private List<T> items;

    public CRUDServiceImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public void removeItem(T item) {
        items.remove(item);
    }

    @Override
    public T find(String name) {
        for (T customer : items) {
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }



    @Override
    public List<T> findAll() {
        return items;
    }

    @Override
    public void updateItem(T item) {

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getName().equals(item.getName())){
                items.set(i,item);
            }
        }

    }

}
