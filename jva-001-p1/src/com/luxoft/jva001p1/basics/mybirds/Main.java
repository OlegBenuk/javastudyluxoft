package com.luxoft.jva001p1.basics.mybirds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static String[][] birds = new String[5][];
    private static int birdSpiecesAmount = 0;

    private static int BIRD = 0;
    private static int PRICE = 1;
    private static int AMOUNT = 2;
    private static int AMOUNT_BOUGHT = 3;
    private static int PURCHASE = 4;

    public static void main(String[] args) {
        fillTestData();
        print();
        addBirdToStore("eagle", 10, 145.99, 99.99);
        print();

    }

    public static void print() {
        System.out.printf("|%10s| |%10s| |%10s| |%15s| |%10s|", "Bird", "Price", "Amount", "Amount bought", "Purchase");
        System.out.println();
        System.out.println("_____________________________________________________________________");
        for (String[] bird : birds) {
            System.out.printf("|%10s| |%10s| |%10s| |%15s| |%10s|", bird[BIRD], bird[PRICE], bird[AMOUNT], bird[AMOUNT_BOUGHT], bird[PURCHASE]);
            System.out.println();
        }
        System.out.println();

    }

    private static boolean fillTestData() {
        //name,price, amount, amountBought,purchase

        birds = new String[][]{{"raven", "20", "5", "3", "10"},
                {"duck", "10", "7", "20", "5"},
                {"falcon", "100", "2", "1", "70"}};
        birdSpiecesAmount=3;
        return true;
    }

    public static boolean buyBird(String birdToBuy) {
        int birdIndex = findBird(birdToBuy);
        birds[birdIndex][AMOUNT] = String.valueOf(Integer.parseInt(birds[birdIndex][AMOUNT]) - 1);
        birds[birdIndex][AMOUNT_BOUGHT] = String.valueOf(Integer.parseInt(birds[birdIndex][AMOUNT_BOUGHT]) + 1);
        System.out.println("You successfully bought a nice " + birds[birdIndex][BIRD] + "\n");
        return true;
    }

    private static int findBird(String birdName) {
        for (int i = 0; i < birds.length; i++) {
            if (birdName.toLowerCase().equals(birds[i][BIRD])) {
                return i;
            }
        }
        System.out.println("We don't have " + birdName + " in our store\n");
        return -1;
    }

    public static boolean changePrice(String birdName, Double newPrice) {
        String tempForOldPrice;
        int birdIndex = findBird(birdName);
        tempForOldPrice = birds[birdIndex][1];
        birds[birdIndex][PRICE] = String.valueOf(newPrice);
        System.out.println("You successfully changed price of the " + birds[birdIndex][BIRD] + " from " + tempForOldPrice + " to " + newPrice + "\n");
        return true;
    }

    public static boolean addBirdToStore(String birdName, int quantity, double priceToSell, double purchase) {
        int birdIndex = findBird(birdName);
        if (birdIndex == -1) {
            birds[birdSpiecesAmount][BIRD] = birdName;
            birds[birdSpiecesAmount][AMOUNT] = String.valueOf(quantity);
            birds[birdSpiecesAmount][BIRD] = birdName;


            birdSpiecesAmount++;
        }
        addBirdToStore(birdName, quantity);
        return true;
    }

    public static boolean addBirdToStore(String birdName, int quantity) {
        int birdIndex = findBird(birdName);
        if (birdIndex == -1) {
            System.out.println("This bird is new. You need to use method addBirdToStore with many parameters");
            return false;
        }
        birds[birdIndex][AMOUNT] = String.valueOf(Integer.parseInt(birds[birdIndex][AMOUNT]) + quantity);
        return true;
    }
}


