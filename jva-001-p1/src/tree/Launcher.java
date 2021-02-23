package tree;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Leaf greenLeaf = new Leaf();
        greenLeaf.setColor("Green");
        greenLeaf.setLength(5);

        Leaf yellowLeaf = new Leaf();
        yellowLeaf.setColor("Yellow");
        yellowLeaf.setLength(3);

        Branch firstBranch = new Branch();
        firstBranch.setLeafesNumber(3);
        firstBranch.setCrookedIndex(3);
        ArrayList<Leaf> firstBranchLeaves = new ArrayList<>();
        firstBranchLeaves.add(greenLeaf);
        firstBranchLeaves.add(greenLeaf);
        firstBranchLeaves.add(yellowLeaf);
        firstBranch.setLeafes(firstBranchLeaves);

        Branch secondBranch = new Branch();
        secondBranch.setLeafesNumber(3);
        secondBranch.setCrookedIndex(5);
        ArrayList<Leaf> secondBranchLeaves = new ArrayList<>();
        secondBranchLeaves.add(greenLeaf);
        secondBranchLeaves.add(greenLeaf);
        secondBranchLeaves.add(yellowLeaf);
        secondBranch.setLeafes(secondBranchLeaves);

        Tree appleTree = new Tree();
        appleTree.setFruitTree(true);
        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(firstBranch);
        branches.add(secondBranch);
        appleTree.setBranches(branches);

        printSecondLeafOnFirstBranch(appleTree);
        printFirstBranchCrookedIndex(appleTree);
        printLeavesNumberOnBranch(appleTree,2);
        printAmountGreenLeavesOnBranch(appleTree,1);

    }

    public static void printSecondLeafOnFirstBranch(Tree tree){
        System.out.println("Second leaf color is "+tree.getBranches().get(0).getLeafes().get(1).getColor());
    }

    public static void printFirstBranchCrookedIndex(Tree tree){
        System.out.println("First branch crooked index is "+ tree.getBranches().get(0).getCrookedIndex());
    }

    public static void printLeafNumberOnSecondBranch(Tree tree){
        System.out.println("Second branch has "+ tree.getBranches().get(1).getLeafesNumber()+" leaves");
    }

    public static void printLeavesNumberOnBranch(Tree tree, int branchNumber){
        System.out.println("Second branch has "+ tree.getBranches().get(branchNumber-1).getLeafesNumber()+" leaves");
    }

    public static void printAmountGreenLeavesOnBranch(Tree tree, int branchNumber){
        int count = 0;
        Branch branch = tree.getBranches().get(branchNumber-1);
        for (Leaf leaf : branch.getLeafes()) {
            if(leaf.getColor().equals("Green")){
                count++;
            }
        }
        System.out.println("There is "+count+ " leaves on branch number "+branchNumber);
    }
}
