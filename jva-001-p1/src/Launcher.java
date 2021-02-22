import java.util.ArrayList;
import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        meizu.brand = "Meizu";
        meizu.price = 139.99;
        meizu.camsAmount = 4;
        meizu.on = true;

        Phone iPhone = new Phone();
        iPhone.brand = "iPhone";
        iPhone.price = 399.99;
        iPhone.camsAmount = 12;
        iPhone.on = false;

        Phone xiaomi = new Phone();
        xiaomi.brand = "Xiaomi";
        xiaomi.price = 199.99;
        xiaomi.camsAmount = 6;
        xiaomi.on = true;

        Phone [] phones = new Phone[3];
        phones[0] = xiaomi;
        phones[1] = iPhone;
        phones[2] = meizu;

        for (Phone phone : phones) {
            phone.printIfOn();
        }
        System.out.println();

        System.out.println("Brand length of phone "+phones[1].brand+ " is "+phones[1].brandLength());

        System.out.println();

        for (Phone phone : phones) {
            System.out.println("One camera in "+ phone.brand+" costs "+phone.pricePerCamera());
        }


//        System.out.println("brand "+xiaomi.brand+", price "+xiaomi.price+ ", number of cameras "+ meizu.camsAmount);
//        System.out.println();
//        Phone [] phones = new Phone[3];
//        phones[0] = xiaomi;
//        phones[1] = iPhone;
//        phones[2] = meizu;
//        System.out.println(Arrays.toString(phones));
//        System.out.println();
//
//        Arrays.sort(phones, (a,b) -> (int) (a.price-b.price));
//
//        for (Phone phone : phones) {
//            System.out.println("brand "+phone.brand+", price "+phone.price+ ", number of cameras "+ phone.camsAmount);
//        }
//        System.out.println();
//
//        ArrayList<Phone> phoneArrayList = new ArrayList<>();
//        phoneArrayList.add(xiaomi);
//        phoneArrayList.add(meizu);
//        System.out.println(phoneArrayList.get(1).brand);

    }



}
