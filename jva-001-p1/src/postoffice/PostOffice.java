package postoffice;

import java.util.ArrayList;

public class PostOffice {
    ArrayList<Letter> letters = new ArrayList<>();
    int lettersSent = 0;
    int lettersDelivered = 0;

    public PostOffice() {
    }

    public ArrayList<Letter> getLetters() {
        return letters;
    }

    public void setLetters(ArrayList<Letter> letters) {
        this.letters = letters;
    }

    public void sendLetter(Letter letter){
        letter.setStatus("Send");
        letters.add(letter);
        lettersSent++;
    }

    public void deliverLetter(Letter letter){
        letter.setStatus("Delivered");
        lettersDelivered++;
    }

    public int getLettersSent() {
        return lettersSent;
    }

    public int getLettersDelivered() {
        return lettersDelivered;
    }

    public ArrayList<Letter> getCopy(Person from, Person to){
        if(from==null&&to==null) {
            return letters;
        }

        ArrayList<Letter> copy = new ArrayList<>();

        if(from == null){
            for (Letter letter : copy) {
                if(letter.getTo().equals(to)){
                    copy.add(letter);
                }
            }
        }

        if(to == null){
            for (Letter letter : copy) {
                if(letter.getFrom().equals(from)){
                    copy.add(letter);
                }
            }
        }
        return copy;
    }



}
