package personwithobjects;

public class Kidneys {
    private int amount;
    private int workCapacity;

    public Kidneys() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWorkCapacity() {
        return workCapacity;
    }

    public void setWorkCapacity(int workCapacity) {
        this.workCapacity = workCapacity;
    }

    @Override
    public String toString() {
        return "personwithobjects.Kidneys{" +
                "amount=" + amount +
                ", workCapacity=" + workCapacity +
                '}';
    }
}
