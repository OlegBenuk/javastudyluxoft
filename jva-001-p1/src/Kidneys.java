public class Kidneys {
    int amount;
    int workCapacity;

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
        return "Kidneys{" +
                "amount=" + amount +
                ", workCapacity=" + workCapacity +
                '}';
    }
}
