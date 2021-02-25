package cafe;

import java.util.ArrayList;

public class Drink {
    private String name;
    private ArrayList<Ingridient> ingridients;
    private double price;
  //  private int drinkSize;

    public Drink() {
        ingridients = new ArrayList<>();
    }

//    public void createNewDrink(ArrayList<Ingridient> newDrinkIngrid){
//
//    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIngridAmount() {
        return ingridients.size();
    }

    public ArrayList<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }
}
