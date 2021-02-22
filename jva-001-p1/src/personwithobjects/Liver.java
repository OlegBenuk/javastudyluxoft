package personwithobjects;

public class Liver {
    String color;
    double weight;

    public Liver() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "personwithobjects.Liver{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
