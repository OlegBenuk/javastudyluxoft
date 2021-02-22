public class Heart {
    int bitsPerMinute;
    double cost;

    public Heart() {
    }

    public int getBitsPerMinute() {
        return bitsPerMinute;
    }

    public void setBitsPerMinute(int bitsPerMinute) {
        this.bitsPerMinute = bitsPerMinute;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "bitsPerMinute=" + bitsPerMinute +
                ", cost=" + cost +
                '}';
    }
}
