package abstractinterface;

public  class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void run() {
        System.out.println("Bird is running");
    }

    //public abstract void sing();
}
