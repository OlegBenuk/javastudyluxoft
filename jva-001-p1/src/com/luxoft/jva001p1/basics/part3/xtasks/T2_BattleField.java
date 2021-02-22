package com.luxoft.jva001p1.basics.part3.xtasks;

public class T2_BattleField
{

    /**
     * TODO PUT YOUR DESIGN HERE
     */
    String[][] battleField = {
            {"B", "B", " ", " ", "B", "B", " ", "B", "B"},
            {" ", " ", " ", "B", " ", " ", "B", "B", " "},
            {"B", "B", "B", "B", " ", "B", " ", "B", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", "B"},
            {"B", " ", " ", " ", "B", " ", " ", "B", " "},
            {" ", " ", "B", "B", " ", " ", "B", " ", " "},
            {"B", "B", " ", " ", " ", "B", "B", "B", "B"},
            {"B", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", "B", " ", "T", "E", "B", " ", "B", "B"}
    };

    void runTheGame() throws Exception
    {
        printCurrentBattleField();
    }

    /**
     * Should print battle field to console output.
     */
    private void printCurrentBattleField()
    {
        String firstRow = "   |  A  B  C  D  E  F  G  H  I";
        String line = "___|___________________________";
        System.out.println(firstRow);
        System.out.println(line);

        for (int i=0;i<battleField.length;i++) {
            System.out.print(i+1+"  |  ");
            for (String string : battleField[i]) {
                System.out.print(string+"  ");
            }
            System.out.println();
        }
    }


    // Magic bellow. Do not worry about this now, you will understand everything in this course.
    // Please concentrate on your tasks only.


    public static void main(String[] args) throws Exception
    {
        T2_BattleField bf = new T2_BattleField();
        bf.runTheGame();
    }

    public T2_BattleField() throws Exception
    {
    }
}