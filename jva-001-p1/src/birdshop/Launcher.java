package birdshop;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Launcher {


    public static void main(String[] args) {
        Shop birdShop = new Shop();

        ProductStorage duck = new ProductStorage();
        duck.setLargeType("Bird");
        duck.setName("Duck");
        duck.setAmount(120);
        duck.setPrice(3.00);
        duck.setPurchase(2.00);
        duck.setItemsSold(0);

        birdShop.addItem(duck);

        ProductStorage eagle = new ProductStorage();
        eagle.setLargeType("Bird");
        eagle.setName("Eagle");
        eagle.setAmount(15);
        eagle.setPrice(15.00);
        eagle.setPurchase(10.00);
        eagle.setItemsSold(0);

        birdShop.addItem(eagle);

        Customer oleg = new Customer();
        oleg.setName("Oleg");

        Customer nike = new Customer();
        nike.setName("Nike");

        ProductStorage duckToSell = new ProductStorage();
        duckToSell.setName("Duck");
        duckToSell.setAmount(2);

        ProductStorage eagleToSell = new ProductStorage();
        eagleToSell.setName("Eagle");
        eagleToSell.setAmount(1);

        birdShop.sellItem("Oleg", "Duck",3);
        birdShop.sellItem("Oleg", "Eagle",2);

        birdShop.sellItem("Nike", "Duck",7);
        birdShop.sellItem("Oleg", "Duck",2);
        birdShop.sellItem("Nike", "Eagle",6);
        birdShop.sellItem("Oleg", "Eagle",3);
        birdShop.sellItem("Nike", "Eagle",1);

        birdShop.print();
    }


}
