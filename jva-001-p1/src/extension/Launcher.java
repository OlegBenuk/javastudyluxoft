package extension;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Tree fruit = new FruitTree();
        Tree firTree = new FirTree();
        System.out.println(firTree instanceof Tree);
       // ArrayList<Tree> trees = new ArrayList<FirTree>();


        fruit.harvest();
        firTree.harvest();
    }
}
