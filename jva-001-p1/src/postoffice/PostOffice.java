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

    public void sendLetter(Letter letter) {
        letter.setStatus("Send");
        letters.add(letter);
        lettersSent++;
    }

    public void deliverLetter(Letter letter) {
        letter.setStatus("Delivered");
        lettersDelivered++;
    }

    public int getLettersSent() {
        return lettersSent;
    }

    public int getLettersDelivered() {
        return lettersDelivered;
    }

    public ArrayList<Letter> getCopy(Person from, Person to) {
        if (from == null && to == null) {
            return letters;
        }

        ArrayList<Letter> copy;

            copy = getListLettersFromPerson(from);
            copy = getListLettersToPerson(to, copy);


        return copy;
    }

    public ArrayList<Letter> getListLettersFromPerson(Person from) {
        if(from==null) {return letters;}

        ArrayList<Letter> copyFrom = new ArrayList<>();
        for (Letter letter : letters) {
            if (letter.getFrom().equals(from)) {
                copyFrom.add(letter);
            }
        }
        return copyFrom;
    }

    public ArrayList<Letter> getListLettersToPerson(Person to, ArrayList<Letter> list) {
        if(to==null){return list;}

        ArrayList<Letter> copyTo = new ArrayList<>();
        for (Letter letter : list) {
            if (letter.getTo().equals(to)) {
                copyTo.add(letter);
            }
        }
        return copyTo;
    }


}
