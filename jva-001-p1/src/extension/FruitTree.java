package extension;

public class FruitTree extends Tree{
    private int numberOfFruits = 0;

    public void harvest(){
        numberOfFruits++;
        System.out.println("New fruits");
    }
}
