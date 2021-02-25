package animal;

public class Animal {

    public Animal() {
        System.out.println("Animal constructor");
    }

    private int legsNumber = 4;

    public void move(){
        System.out.println("animal walks");
    }

    public void sleep(){
        System.out.println("Animal snoring");
    }

    public int getLegsNumber() {
        return legsNumber;
    }
}
