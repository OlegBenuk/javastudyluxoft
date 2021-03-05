package linkedlist;

import java.io.IOException;

public class Launcher {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();
        integerList.add(3);
        integerList.add(6);
        integerList.add(8);
        integerList.add(5);
        integerList.print();


        Inner.Inside.hello();

//        new IntegerList().new Node(4).test();
//        integerList.new Node(4).test();

//        new IntegerList.Node(4);

        IntegerList.Node.test();

    }
}
