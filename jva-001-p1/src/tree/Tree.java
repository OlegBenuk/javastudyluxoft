package tree;

import java.util.ArrayList;

public class Tree {
    private boolean fruitTree;
    private ArrayList<Branch> branches;

    public Tree() {
    }

    public boolean isFruitTree() {
        return fruitTree;
    }

    public void setFruitTree(boolean fruitTree) {
        this.fruitTree = fruitTree;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
