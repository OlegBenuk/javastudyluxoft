package cafe;

import com.luxoft.jva001p1.oop.inheritance.p1animals.D;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Ingridient lemon = new Ingridient();
        lemon.setValue("lemon");

        Ingridient blackTea = new Ingridient();
        blackTea.setValue("blackTea");

        Ingridient greenTea = new Ingridient();
        greenTea.setValue("greenTea");

        Ingridient water = new Ingridient();
        water.setValue("water");

        Ingridient milk = new Ingridient();
        milk.setValue("milk");

        Ingridient coffee = new Ingridient();
        coffee.setValue("coffee");




        Drink latte = new Drink();
        Ingridient korica = new Ingridient();
        korica.setValue("korica");
        latte.setName("Latte");
        ArrayList<Ingridient> latteIngrid = new ArrayList<>();
        latteIngrid.add(coffee);
        latteIngrid.add(water);
        latteIngrid.add(milk);
        latteIngrid.add(korica);
        latteIngrid.add(milk);
        latte.setIngridients(latteIngrid);

        Drink teaWithLemon = new Drink();
        teaWithLemon.setName("Tea with lemon");
        ArrayList<Ingridient> teaWithLemonIngrid = new ArrayList<>();
        teaWithLemonIngrid.add(blackTea);
        teaWithLemonIngrid.add(water);
        teaWithLemonIngrid.add(lemon);
        teaWithLemon.setIngridients(teaWithLemonIngrid);



        Menu menu = new Menu();
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(teaWithLemon);
        drinks.add(latte);
        menu.setDrinks(drinks);


        Drink coffeeWithLemon = new Drink();
        coffeeWithLemon.setName("Coffee with lemon");
        ArrayList<Ingridient> coffeeWithLemonIngrid = new ArrayList<>();
        coffeeWithLemonIngrid.add(coffee);
        coffeeWithLemonIngrid.add(lemon);
        coffeeWithLemon.setIngridients(coffeeWithLemonIngrid);
        menu.addDrinkToMenu(coffeeWithLemon);

menu.printMenu();

    }


}
