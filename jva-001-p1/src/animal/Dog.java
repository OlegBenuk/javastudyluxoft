package animal;

public class Dog extends Animal{

    public Dog() {
        System.out.println("Dog constructor");

    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Dog is sleeping");
    }
}
