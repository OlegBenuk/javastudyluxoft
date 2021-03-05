package birdshop;

import java.util.List;

public interface CRUDService<T> {

    void addItem(T item);

    void removeItem(T item);

    T find(String name);

    List<T> findAll();

    void updateItem(T item);



}
