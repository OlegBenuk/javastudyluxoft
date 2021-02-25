package cafe;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Drink> drinks;

    public Menu() {
        drinks = new ArrayList<>();
    }

    public void addDrinkToMenu(Drink drink){
        drinks.add(drink);
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public void printMenu(){
        for (Drink drink : drinks) {
            System.out.print(drink.getName()+" : "+drink.getPrice()+" : ");
            for (Ingridient ingridient : drink.getIngridients()) {
                System.out.print(ingridient.getValue()+", ");
            }
            System.out.println();
        }
    }
}
