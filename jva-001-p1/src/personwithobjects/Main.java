package personwithobjects;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        Kidneys p1Kidneys = new Kidneys();
        p1Kidneys.setAmount(2);
        p1Kidneys.setWorkCapacity(76);

        Heart p1Heart = new Heart();
        p1Heart.setBitsPerMinute(96);
        p1Heart.setCost(200_000);

        Liver p1Liver  =new Liver();
        p1Liver.setColor("Green");
        p1Liver.setWeight(630);

        p1.setHeart(p1Heart);
        p1.setKidneys(p1Kidneys);
        p1.setLiver(p1Liver);

        System.out.println(p1);

    }
}
