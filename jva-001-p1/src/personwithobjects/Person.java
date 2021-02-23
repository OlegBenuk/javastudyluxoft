package personwithobjects;

public class Person {
    private Kidneys kidneys;
    private Heart heart ;
    private Liver liver;

    public Person() {
    }

    public Kidneys getKidneys() {
        return kidneys;
    }

    public void setKidneys(Kidneys kidneys) {
        this.kidneys = kidneys;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Liver getLiver() {
        return liver;
    }

    public void setLiver(Liver liver) {
        this.liver = liver;
    }

    @Override
    public String toString() {
        return "personwithobjects.Person\n{" + kidneys +
                ", \n" + heart +
                ", \n" + liver +
                '}';
    }
}
