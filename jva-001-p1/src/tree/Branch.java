package tree;

import java.util.ArrayList;

public class Branch {
    private int leafesNumber;
    private int crookedIndex;
    private ArrayList<Leaf> leafes = new ArrayList<>();

    public Branch() {
    }

    public int getLeafesNumber() {
        return leafesNumber;
    }

    public void setLeafesNumber(int leafesNumber) {
        this.leafesNumber = leafesNumber;
    }

    public int getCrookedIndex() {
        return crookedIndex;
    }

    public void setCrookedIndex(int crookedIndex) {
        this.crookedIndex = crookedIndex;
    }

    public ArrayList<Leaf> getLeafes() {
        return leafes;
    }

    public void setLeafes(ArrayList<Leaf> leafes) {
        this.leafes = leafes;
    }
}
