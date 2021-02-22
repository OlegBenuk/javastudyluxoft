package phoneobject;

public class Phone {
    boolean on;
    double price;
    String brand;
    int camsAmount;

    public double pricePerCamera(){
        return price/camsAmount;
    }

    public void printIfOn(){
        if(on){
            System.out.println("brand "+brand+", price "+price+ ", number of cameras "+ camsAmount);
        }
    }

    public int brandLength(){
        return brand.length();
    }


}
