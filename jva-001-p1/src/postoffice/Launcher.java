package postoffice;

public class Launcher {
    public static void main(String[] args) {


        Person oleg = new Person();
        oleg.setName("Oleg");

        Person masha = new Person();
        oleg.setName("Masha");


        Letter letter = new Letter();
        letter.setFrom(oleg);
        letter.setTo(masha);
        letter.setText("Hello Masha");

        PostOffice postOffice = new PostOffice();
        postOffice.sendLetter(letter);

        System.out.println(postOffice.lettersSent);

        System.out.println(postOffice.getCopy(null, null).get(0).getText());


    }
}
