package animal;

public class Doberman extends Dog{
    public Doberman() {        System.out.println("Doberman constructor");

    }

    @Override
    public void move() {

        System.out.println("Doberman use all "+super.getLegsNumber()+" paws to run");

        super.sleep();
    }

    public void bite(){
        super.move();
        System.out.println();
        move();
        System.out.println();
        System.out.println("Doberman bites");
    }
}
